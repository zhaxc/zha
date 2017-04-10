package com.test.api;

import com.zw.entity.User;
import com.zw.utils.TestUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhaxc
 * \* Date: 2017/4/10
 * \* Time: 11:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ClassDemo {

    User user;

    @Before
    public void init() {
        user = new User();
    }

    /**
     * 获取Class对象的方法
     * 1) 使用类名
     * Class c1 = 类名.class;
     * 2) 使用静态方法
     * 类加载时 static静态代码块会运行
     * Class c2 = Class.forName("包名.包名.类名");
     *　3) 使用 类的对象 获取
     *　Student s = new Student();
     *　Class c3 = s.getClass();
     */
    @Test
    public void getClassInstance(){
        // 1
        Class<Serializable> c1 = Serializable.class;
        System.out.println("c1 = " + c1);

        // 2
        try {
            Class<?> c2 = Class.forName("com.test.api.ClassDemo");
            System.out.println("c2 = " + c2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 3
        Class<? extends ClassDemo> c3 = new ClassDemo().getClass();
        System.out.println("c3 = " + c3);
    }

    /**
     * public T newInstance() throws InstantiationException,IllegalAccessException
     * 创建此 Class 对象所表示的类的一个新实例
     */
    @Test
    public void newInstance() {
        try {
            User user = User.class.newInstance();
            user.setId(1);
            TestUtil.printJson(user);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * public boolean isInstance(Object obj)
     * 判定指定的 Object 是否与此 Class 所表示的对象赋值兼容
     */
    @Test
    public void isInstance() {
        boolean instance = User.class.isInstance(user);
        System.out.println("instance = " + instance);
        boolean hello = String.class.isInstance("hello");
        System.out.println("hello = " + hello);
        boolean instance1 = Integer.class.isInstance(user);
        System.out.println("instance1 = " + instance1);
    }

    /**
     * public boolean isAssignableFrom(Class<?> cls)
     * 判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，或是否是其超类或超接口。
     */
    @Test
    public void isAssignableFrom() {
        boolean assignableFrom = Object.class.isAssignableFrom(String.class);
        System.out.println("assignableFrom = " + assignableFrom);
    }

    /**
     * public boolean isInterface()
     * 判定指定的 Class 对象是否表示一个接口类型。
     */
    @Test
    public void isInterface() {
        boolean anInterface = Serializable.class.isInterface();
        System.out.println("anInterface = " + anInterface);
    }

    /**
     * public boolean isArray()
     * 判定此 Class 对象是否表示一个数组类。
     */
    @Test
    public void isArray() {
        String[] strings = {"hello", "world"};
        boolean array = strings.getClass().isArray();
        System.out.println("array = " + array);
    }

    /**
     * public boolean isPrimitive()
     * 判定指定的 Class 对象是否表示一个基本类型。
     */
    @Test
    public void isPrimitive() {
        boolean primitive = int.class.isPrimitive();
        System.out.println("primitive = " + primitive);
    }

    /**
     * public boolean isAnnotation()
     * 如果此 Class 对象表示一个注释类型则返回 true
     * 所有的注释类型同时也是接口
     */
    @Test
    public void isAnnotation() {
        boolean annotation = Test.class.isAnnotation();
        System.out.println("annotation = " + annotation);
        boolean anInterface = Test.class.isInterface();
        System.out.println("anInterface = " + anInterface);
    }

    /**
     * public boolean isSynthetic()
     * 如果此类是复合类，则返回 true，否则 false。
     */
    @Test
    public void isSynthetic() {

    }


}