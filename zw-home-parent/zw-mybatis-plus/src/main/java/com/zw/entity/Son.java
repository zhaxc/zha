package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author zha
 * @since 2017-11-29
 */
@TableName("t_son")
public class Son extends Parent {

    private static final long serialVersionUID = 1L;

	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
