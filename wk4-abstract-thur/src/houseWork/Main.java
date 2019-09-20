package houseWork;

public class Main {
    public static void main(String args[]){
        Serval buddy = new Serval("Buddy", 50, "Cat");
        Cheetah guy = new Cheetah("Guy", 35, "Cat");
        Household myCrib = new NycApartment(75000, buddy);
        Household newCrib = new NycCondo(85000, guy);
    }
}
