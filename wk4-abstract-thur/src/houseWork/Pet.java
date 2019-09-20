package houseWork;

abstract class Pet implements PetEngagement {
    String name;
    int age;
    String species;

    public Pet(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }
}
