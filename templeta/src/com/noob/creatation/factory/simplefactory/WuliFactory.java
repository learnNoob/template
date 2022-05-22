package com.noob.creatation.factory.simplefactory;

public class WuliFactory {
    public AbstractCar newCar(String type){
        if ("van".equals(type)){
            return new VanCar();
        }
        if ("min".equals(type)){
            return new MinCar();
        }
        return null;
    }
}
