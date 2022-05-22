package com.noob.creatation.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WuliFactory wuliFactory = new WuliFactory();
        AbstractCar van = wuliFactory.newCar("van");
        System.out.println(van);
        AbstractCar min = wuliFactory.newCar("min");
        System.out.println(min);

    }
}
