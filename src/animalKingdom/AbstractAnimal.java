package animalKingdom;

public abstract class AbstractAnimal {
    protected static int maxNumber = 0;
    protected int number;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year) {
        this.name = name;
        this.year = year;
        maxNumber++;
        number = maxNumber;
    }

    public int getNumber() {
        return number;
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}