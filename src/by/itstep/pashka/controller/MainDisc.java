package by.itstep.pashka.controller;

public class MainDisc {
    public static  void main(String[] args) throws ArrayIndexOutOfBoundsException,
            NullPointerException{

        Disc disc = new Disc();

        Disc.add(new Track());

        Disc.delete(new Track());

        System.out.println(Disc.getInfo(disc));
    }
}
