package houseWork;

public class Cheetah extends Pet {
    public Cheetah(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void feed(){
        System.out.println("You just fed your Cheetah a slice of pizza...");
    }

    @Override
    public void groom(){
        System.out.println("Your Cheetah is purring loudly after you've brushed it");
    }

    @Override
    public void play(){
        System.out.println("You're Cheetah wants you to chase it... so you do");
    }
}
