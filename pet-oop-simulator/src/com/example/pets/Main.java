package com.example.pets;

public class Main {
    public static void main(String[] args) {
        // 建立寵物
        Pet dog = new Dog("小黑");
        Pet cat = new Cat("小花");
        Pet parrot = new Parrot("小綠");

        // 建立飼主
        Owner owner = new Owner("阿志");

        // 新增寵物到飼主名下
        owner.addPet(dog);
        owner.addPet(cat);
        owner.addPet(parrot);

        // 顯示所有寵物資訊
        owner.showPets();
    }
}
