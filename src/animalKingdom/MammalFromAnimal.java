package animalKingdom;

public class MammalFromAnimal extends AbstractAnimal {
    public MammalFromAnimal(String name, int year) {
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return "MammalFromAnimal{" + "Name= " + name + ", Year Named= " + year + "}";
    }
}