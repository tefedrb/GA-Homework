package houseWork;

public class Serval extends Pet {
    public Serval(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void feed() {
        System.out.println("You've fed your Serval donuts. Good job.");
    }

    @Override
    public void groom() {
        System.out.println("Ohh Serval likes being brushed");
    }

    @Override
    public void play() {
        System.out.println("You've just had a play session with your Serval");
    }
}
