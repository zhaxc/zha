package com.lanyuan.shiro;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.config.Ini;
import org.springframework.beans.factory.FactoryBean;

import com.lanyuan.entity.ResFormMap;
import com.lanyuan.mapper.ResourcesMapper;
import com.lanyuan.util.ConfigUtils;

/**
 * 
 * 自定义filterChainDefinitionMap
 * 产生责任链，确定每个url的访问权限
 * 
 */
public class ChainDefinitionSectionMetaSource implements FactoryBean<Ini.Section> {

	@Inject
	private ResourcesMapper resourcesMapper;

	// 静态资源访问权限 (配置文件注入)
	private String filterChainDefinitions = null;
	
	/**
	 * FactoryBean<T>接口的Bean，根据该Bean的Id从BeanFactory中获取的实际上是FactoryBean的getObject()返回的对象，而不是FactoryBean本身
	 */
	public Ini.Section getObject() throws Exception {
		//初始化数据库表字段到缓存
		new ConfigUtils().initTableField(); 
		
		Ini ini = new Ini();
		// 加载默认的url
		ini.load(filterChainDefinitions);
		Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		// 循环Resource的url,逐个添加到section中。section就是filterChainDefinitionMap,
		// 里面的键就是链接URL,值就是存在什么条件才能访问该链接
		List<ResFormMap> lists = resourcesMapper.findByWhere(new ResFormMap());
		for (ResFormMap resources : lists) {
			// 构成permission字符串
			if (StringUtils.isNotEmpty(resources.get("resUrl") + "") && StringUtils.isNotEmpty(resources.get("resKey") + "")) {
				String permission = "perms[" + resources.get("resKey") + "]";
				System.out.println(permission);
				// 不对角色进行权限验证
				// 如需要则 permission = "roles[" + resources.getResKey() + "]";
				section.put(resources.get("resUrl") + "", permission);
			}

		}
		// 所有资源的访问权限，必须放在最后
		/*section.put("/**", "authc");*/
		section.put("/**", "authc,kickout,sysUser,user");
		return section;
	}

	/**
	 * 工厂生产对象类型
	 */
	public Class<?> getObjectType() {
		return this.getClass();
	}
	
	/**
	 * 指定是否单例
	 */
	public boolean isSingleton() {
		return false;
	}
	
	/**
	 * 通过filterChainDefinitions对默认的url过滤定义
	 * 
	 * @param filterChainDefinitions
	 *            默认的url过滤定义
	 */
	public void setFilterChainDefinitions(String filterChainDefinitions) {
		this.filterChainDefinitions = filterChainDefinitions;
	}
}
