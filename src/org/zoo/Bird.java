package org.zoo;

public class Bird extends Animal implements CanFly{
    @Override
    public void makeASound() {
        System.out.println("pio pio");
    }

    @Override
    public void eat() {
        System.out.println("Mangio vermi");
    }

    @Override
    public void fly() {
        System.out.println("che bello volare!!!");
    }
}
