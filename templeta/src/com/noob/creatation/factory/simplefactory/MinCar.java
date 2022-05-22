package com.noob.creatation.factory.simplefactory;

public class MinCar extends AbstractCar{
    public MinCar(){
        this.engine = "四缸发动机";
    }
    @Override
    public void run() {
        System.out.println(engine+"====哒哒哒");
    }
}
