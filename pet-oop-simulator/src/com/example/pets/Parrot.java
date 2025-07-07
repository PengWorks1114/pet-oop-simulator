package com.example.pets;

public class Parrot extends Pet implements Talkable {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "鸚鵡叫");
    }

    @Override
    public void introduce() {
        System.out.println("我是鸚鵡,我叫: " + getName());
    }
}

