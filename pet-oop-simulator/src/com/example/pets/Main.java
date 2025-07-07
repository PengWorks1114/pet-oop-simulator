package com.example.pets;

public class Main {
    public static void main(String[] args) {
        Talkable[] pets = {
                new Dog("小黑"),
                new Cat("小花"),
                new Parrot("小綠")
        };

        for (Talkable pet : pets) {
            // 多型：介面統一呼叫不同類別的 speak 方法
            pet.speak();

            // 若物件同時也是 Pet，則呼叫 introduce 方法
            if (pet instanceof Pet) {
                ((Pet) pet).introduce();
            }

            System.out.println("-----------");
        }
    }
}
