package com.example.pets;

public class Dog extends Pet implements Talkable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "狗叫");
    }

    @Override
    public void introduce() {
        System.out.println("我是狗,我叫: " + getName());
    }
}
