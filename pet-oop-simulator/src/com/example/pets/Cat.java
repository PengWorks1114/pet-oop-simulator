package com.example.pets;

public class Cat extends Pet implements Talkable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "貓叫");
    }

    @Override
    public void introduce() {
        System.out.println("我是貓,我叫: " + getName());
    }
}

