package org.zoo;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void makeASound() {
        System.out.println("squint squint");
    }

    @Override
    public void eat() {
        System.out.println("Mangio pesce");
    }

    @Override
    public void swim() {
        System.out.println("in fondo al mar...!!!");
    }
}
