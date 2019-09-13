package animalKingdom;

public abstract class AbstractAnimal {
    protected static int number = 0;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public AbstractAnimal() {
        number++;
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}