package com.zha.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.zha.entity.User;
import com.zha.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jack
 * @since 2018-08-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 分页 PAGE
     */
    @GetMapping("/test")
    public Page<User> test() {
        return userService.selectPage(new Page<User>(0, 3));
    }

    @GetMapping("/test1")
    public Boolean test1() {
        return userService.deleteAll();
    }


    /**
     * 增删改查 CRUD
     */
    @GetMapping("/test2")
    public User test2() {

        User user = new User();
        user.setId(1);
        user.setName("jack");
        user.setAge(16);
        boolean result = userService.insert(user);
        int id = user.getId();
        System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
        System.err.println("查询：" + userService.selectById(id).toString());
        System.err.println("更新一条数据：" + userService.updateById(new User(id, "alice", 18)));
        for (int i = 0; i < 5; ++i) {
            userService.insert(new User( "jack" + i, 1));
        }
        Page<User> userListPage = userService.selectPage(new Page<User>(1, 3));
        System.err.println("total=" + userListPage.getTotal() + ", current list size=" + userListPage.getRecords().size());
        return userService.selectById(1);
    }


    @GetMapping("/test3")
    public User test3() {
        User user = new User(1, "jason",  16);
        System.out.println("插入前：" + user.toString());
        userService.insertOrUpdate(user);
        user = userService.selectById(1);
        System.out.println("更新后：" + user.toString());
        return user;
    }


    /**
     * 测试实体注解注入条件 LIKE 查询
     */
    @GetMapping("/like")
    public Object like() {
        JSONObject result = new JSONObject();
        User user = new User();
        user.setName("j");
        result.put("result", userService.selectList(new EntityWrapper<User>(user)));
        return result;
    }

    @GetMapping("/add")
    public Object addUser() {
        User user = new User("xiaomi",  1);
        JSONObject result = new JSONObject();
        result.put("result", userService.insert(user));
        return result;
    }

    @GetMapping("/selectsql")
    public Object getUserBySql() {
        JSONObject result = new JSONObject();
        result.put("records", userService.selectListBySQL());
        return result;
    }

    /**
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8080/user/page?size=1&current=1<br>
     * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1<br>
     */

    // 参数模式分页
    @GetMapping("/page")
    public Object page(Page page) {
        return userService.selectPage(page);
    }


    @GetMapping("/pages")
    public Object selectUserPage(Page<User> page){
        return userService.selectUserPage(page);
    }


    // ThreadLocal 模式分页
    @GetMapping("/pagehelper")
    public Object pagehelper(Page page) {
        PageHelper.setPagination(page);
        page.setRecords(userService.selectList(null));
        page.setTotal(PageHelper.freeTotal());//获取总数并释放资源 也可以 PageHelper.getTotal()
        return page;
    }


    /**
     * 测试事物
     * http://localhost:8080/user/test_transactional<br>
     * 访问如下并未发现插入数据说明事物可靠！！<br>
     * http://localhost:8080/user/test<br>
     * <br>
     * 启动  Application 加上 @EnableTransactionManagement 注解其实可无默认貌似就开启了<br>
     * 需要事物的方法加上 @Transactional 必须的哦！！
     */
    @Transactional
    @GetMapping("/test_transactional")
    public void testTransactional() {
        userService.insert(new User(1000, "apple",  3));
        System.out.println(" 这里手动抛出异常，自动回滚数据");
        throw new RuntimeException();
    }

    @Cacheable("user-key")
    @GetMapping("/getUser")
    public User getUser(Integer id) {
        return this.userService.selectById(id);
    }

    @GetMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}

