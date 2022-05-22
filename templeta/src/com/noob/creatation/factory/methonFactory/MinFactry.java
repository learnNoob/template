package com.noob.creatation.factory.methonFactory;

public class MinFactry extends AbstactWuliFactory{
    @Override
    public AbstractCar carRun() {
        return new MinCar();
    }
}
