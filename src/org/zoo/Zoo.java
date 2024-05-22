package org.zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog(), new Bird(), new Eagle(), new Dolphin()};

        for (Animal animale : zoo) {
            animale.sleep();
            animale.makeASound();
            animale.eat();

            if (animale instanceof CanFly) {
                ((CanFly) animale).fly();
            }

            if (animale instanceof CanSwim) {
                ((CanSwim) animale).swim();
            }
        }





    }
}
