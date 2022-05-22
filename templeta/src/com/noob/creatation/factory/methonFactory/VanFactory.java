package com.noob.creatation.factory.methonFactory;

public class VanFactory extends AbstactWuliFactory{
    @Override
    public AbstractCar carRun() {
        return new VanCar();
    }
}
