package com.noob.creatation.prototype;

import java.util.HashMap;

/**
 * 用于创建重复的对象，同时有能保证性能
 * 1.场景：操作数据库，从数据库中查很多条数据（70%改变很少）
 *        每次查数据库，查到的所有的数据封装成一个对象，返回
 *        10000 Thread,查一条记录：new User（"张三"，"18"）；每次创建一个对象封装返回
 *        系统就会有10000个user对象，浪费内存
 * 2.解决方法：缓存：查过的保存
 *           如果再查相同的记录，那原来的原型记录
 *
 *
 * @author lizhiquan
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        NoobMybatis noobMybatis = new NoobMybatis();
        User user1 = noobMybatis.getUser("张三");
        System.out.println(user1);
        User user2 = noobMybatis.getUser("张三");
        user2.setUserName("lisi");
        System.out.println(user2);
        User user3 = noobMybatis.getUser("张三");
        System.out.println(user3);
        User user4 = noobMybatis.getUser("张三");
        System.out.println(user4);
    }

}
