package com.example.pets;

public abstract class Pet {
    private String name;
    protected int hunger; // 0（飽）～100（非常餓）

    public Pet(String name) {
        this.name = name;
        this.hunger = 50; // 預設中等飢餓
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void feed() {
        if (hunger > 0) {
            hunger -= 20;
            if (hunger < 0) hunger = 0;
            System.out.println(name + " 吃飽了！目前飢餓值：" + hunger);
        } else {
            System.out.println(name + " 已經吃得很飽了！");
        }
    }

    public void showStatus() {
        System.out.println(name + " 的飢餓值是 " + hunger + "（0=飽，100=餓）");
    }

    public abstract void introduce();
}
