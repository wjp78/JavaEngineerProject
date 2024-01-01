package com.imooc.pt.MethodParameterSample;

public abstract class Animal {
    public String name;
    public abstract void play();

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
