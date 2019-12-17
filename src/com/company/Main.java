package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Snake snake = new Snake();
        snake.makeVoice();
        snake.draw();
        System.out.println(snake.draw3d("plastic"));
        snake.move();
        System.out.println("__________________");
        Dog dog = new Dog();
        dog.setYear(1);
        dog.setColor("Black");
        dog.makeVoice();
        dog.draw();
        System.out.println(dog.draw3d("metall"));

        Animal cat = new Cat();
        Reptily snake2 = new Snake();

        Animal[] animals =
                { snake ,dog, cat, snake2};
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeVoice();
            animals[i].draw();
            System.out.println(animals[i].draw3d("wood"));
           if(animals[i] instanceof Reptily) {
               ((Reptily) animals[i]).fly();
           }
           drawAll(cat);
           drawAll(dog);


        }
        double num = 7.8;
        System.out.println((int)num);


    }

    public static void drawAll(Animal animal){
        animal.draw();
        System.out.println(animal.draw3d( "metall"));
    }
}
