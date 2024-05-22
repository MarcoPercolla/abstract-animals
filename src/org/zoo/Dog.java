package org.zoo;

public class Dog extends Animal{
    @Override
    public void makeASound() {
        System.out.println("Bau bau");
    }

    @Override
    public void eat() {
        System.out.println("Mangio carne");
    }
}
