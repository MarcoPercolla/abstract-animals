package org.console;

public class Creator {
    public static Console create(String type){
        if(type.equals("dvd")){
            return new DvdPlayer();
        } else if (type.equals("play")) {
            return new Playstation();
        } else {
            throw new IllegalArgumentException("dispositivo non valido: " + type);
        }
    }
    public static void main(String[] args) {
        Console dvdPlayer1 = Creator.create("dvd");
        Console playstation1 = Creator.create("play");

        dvdPlayer1.play();
        playstation1.play();
        dvdPlayer1.stop();
        playstation1.stop();
    }
}
