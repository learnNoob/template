package com.noob.creatation;

/**
 * @author lizhiquan
 */
public class Person {
    private String name;
    private String age;
    public static volatile Person person = new Person();

    private Person(){
        System.out.println("创建Person对象");
    }

    /**
     *  双重检查锁
     * @return
     */
    public static Person getInstance(){
        if (person == null){
            synchronized (Person.class){
                if (person == null){
                    person = new Person();
                }
            }
        }
        return person;
    }

}
