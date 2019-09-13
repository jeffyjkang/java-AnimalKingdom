package animalKingdom;

public class FishFromAnimal extends AbstractAnimal {
    public FishFromAnima(String name; int year){
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "FishFromAnimal{" + "Name= " + name + ", Year Named= " + year + "}";
    }
}