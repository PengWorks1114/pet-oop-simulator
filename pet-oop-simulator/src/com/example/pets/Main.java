package com.example.pets;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("小黑");
        Pet cat = new Cat("小花");
        Pet parrot = new Parrot("小綠");

        Owner owner = new Owner("阿志");
        owner.addPet(dog);
        owner.addPet(cat);
        owner.addPet(parrot);

        // 顯示寵物資訊
        owner.showPets();

        System.out.println("🧑‍🦱 阿志開始餵食寵物...\n");

        dog.feed();
        cat.feed();
        parrot.feed();

        System.out.println("\n📋 餵食後狀態：");
        dog.showStatus();
        cat.showStatus();
        parrot.showStatus();
    }
}
