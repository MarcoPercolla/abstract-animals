package org.zoo;

public abstract class Animal {
    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void makeASound();

    public abstract void eat();
}
