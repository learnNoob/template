package com.noob.structural.bridge;


public abstract class AbstractPhone {
    //桥接发生在此
    AbstractSale sale;
    /**
     * 当前手机的描述
     */
    abstract String getPhone();
}
