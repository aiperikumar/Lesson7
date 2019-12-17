package com.company;

public class Cat extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Мяу");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }

    @Override
    public String draw3d(String material) {
        return "Отрисовалась кошка в 3D в формате " + "из " + material;
    }

    @Override
    public void move() {
        System.out.println("Кошка идет");
    }
}
