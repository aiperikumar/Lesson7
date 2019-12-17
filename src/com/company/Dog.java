package com.company;

public class Dog extends Animal{
    @Override
    public void makeVoice() {
        System.out.println("Гав");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public String draw3d(String material) {
        return "Отрисовалась собака в 3D в формате " + "из " + material;
    }

    @Override
    public void move() {
        System.out.println("Собака лежит");
    }
}
