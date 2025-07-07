package com.example.pets;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Pet> pets;

    public Owner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void showPets() {
        System.out.println("我是飼主 " + name + "，這是我的寵物們：");
        for (Pet pet : pets) {
            pet.introduce();  // 抽象方法，由子類實作
            if (pet instanceof Talkable) {
                ((Talkable) pet).speak(); // 呼叫介面方法
            }
            System.out.println("---");
        }
    }
}
