package com.example.pets;

//共通的抽象父類別,不能直接被new
public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //強制所有仔類別都要定義自我介紹的方式
    public abstract void introduce();
}
