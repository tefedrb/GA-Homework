package houseWork;

abstract class Household {
    double incomeTax = .2;
    double yearlyIncome;
    protected double sideHussle = 0;
    Pet petType;

    public double applyTaxes(){
        return yearlyIncome * incomeTax;
    };

    public abstract void earnSideMoney();

    public void displayFinances(){
        double withTax = applyTaxes();
        System.out.println("You paid 20% in taxes. Your net income for the year is " + withTax);
    }

    public Household(double income, Pet pet){
        this.yearlyIncome = income;
        this.petType = pet;
    }
}
