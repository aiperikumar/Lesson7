package com.company;

public class Snake extends Reptily{
    @Override
    public void makeVoice() {
        System.out.println("Ссссс");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC0D");
    }

    @Override
    public String draw3d(String material) {
        return "Отрисовалась змея в 3D в формате " + "из " + material;
    }

    @Override
    public void move() {
        System.out.println("Змея ползет");
    }
}
