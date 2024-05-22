package org.zoo;

public class Eagle extends Animal implements CanFly{
    @Override
    public void makeASound() {
        System.out.println("flap flap");
    }

    @Override
    public void eat() {
        System.out.println("Mangio carne");
    }

    @Override
    public void fly() {
        System.out.println("volo altissimo!!!");
    }
}
