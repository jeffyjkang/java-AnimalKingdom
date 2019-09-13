package animalKingdom;

public class BirdFromAnimal extends AbstractAnimal {
    public BirdFromAnimal(String name, int year) {
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "BirdFromAnimal{" + "Name= " + name + ", Year Named= " + year + "}";
    }
}