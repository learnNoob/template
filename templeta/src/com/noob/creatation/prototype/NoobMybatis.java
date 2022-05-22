package com.noob.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizhiquan
 */
public class NoobMybatis {


    private Map<String,User> map = new HashMap<>();

    /**
     * 从数据库中查数据
     */
    public User getUser(String userName) throws CloneNotSupportedException {
        User user = getUserForDb(userName);
        return user;
    }


    private User getUserForDb(String username) throws CloneNotSupportedException {
        if (map.containsKey(username)){
            //从缓存中直接拿，可能会引起装缓存，
            User user = map.get(username);
            User clone = (User)user.clone();

            return clone;
        }


        System.out.println("从数据库中查到："+username);
        User user = new User();
        user.setUserName("张三");
        user.setAge(18);
        map.put(username,user);
        return user;

    }
}
