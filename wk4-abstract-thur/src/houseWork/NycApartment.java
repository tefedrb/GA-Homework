package houseWork;

public class NycApartment extends Household{
    public NycApartment(double income, Pet pet){
        super(income, pet);
    }

    @Override
    public void earnSideMoney() {
        double freelanceGig = 900.50;
        sideHussle += freelanceGig;
        System.out.println("You've added an extra " + freelanceGig + " to your income. Be sure to add it to your income.");
    }
}
