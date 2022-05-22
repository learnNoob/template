package com.noob.creatation.factory.methonFactory;

public class MainTest {
    public static void main(String[] args) {
        MinFactry minFactry = new MinFactry();
        System.out.println(minFactry.carRun());
        VanFactory vanFactory = new VanFactory();
        System.out.println(vanFactory.carRun());
    }


}
