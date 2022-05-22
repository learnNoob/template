package com.noob.creatation.prototype;

public class User implements Cloneable{
    private String userName;
    private Integer age;

    public User(){
        System.out.println("创建了User对象");
    }
    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setUserName(userName);
        user.setAge(age);
        return user;
    }
}
