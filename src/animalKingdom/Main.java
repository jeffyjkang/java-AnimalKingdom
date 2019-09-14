package animalKingdom;

import java.util.*;

public class Main {
    // class method to test with boolean
    public static void printAnimal(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println("name: " + a.name + ", movement: " + a.move() + ", breath: " + a.breath()
                        + ", reproduce: " + a.reproduce() + ", year:" + a.year);
            }
        }
    }

    public static void main(String[] args) {
        MammalFromAnimal panda = new MammalFromAnimal("Panda", 1869);
        MammalFromAnimal zebra = new MammalFromAnimal("Zebra", 1778);
        MammalFromAnimal koala = new MammalFromAnimal("Koala", 1816);
        MammalFromAnimal sloth = new MammalFromAnimal("Sloth", 1804);
        MammalFromAnimal armadillo = new MammalFromAnimal("Armadillo", 1758);
        MammalFromAnimal raccoon = new MammalFromAnimal("Raccoon", 1758);
        MammalFromAnimal bigfoot = new MammalFromAnimal("Bigfoot", 2021);
        BirdFromAnimal pigeon = new BirdFromAnimal("Pigeon", 1837);
        BirdFromAnimal peacock = new BirdFromAnimal("Peacock", 1821);
        BirdFromAnimal toucan = new BirdFromAnimal("Toucan", 1758);
        BirdFromAnimal parrot = new BirdFromAnimal("Parrot", 1824);
        BirdFromAnimal swan = new BirdFromAnimal("Swan", 1758);
        FishFromAnimal salmon = new FishFromAnimal("Salmon", 1758);
        FishFromAnimal catfish = new FishFromAnimal("Catfish", 1817);
        FishFromAnimal perch = new FishFromAnimal("Perch", 1758);

        // System.out.println(panda);
        // System.out.println(zebra);
        // System.out.println(pigeon);
        // System.out.println(panda.getNumber());
        // System.out.println(zebra.getNumber());
        // System.out.println(pigeon.getNumber());
        // System.out.println(armadillo.move());
        // System.out.println(toucan.breath());
        // System.out.println(salmon.reproduce());
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
        //
        System.out.println(animalList.toString());
        System.out.println();
        // animals in descending order by year named
        animalList.sort((a1, a2) -> a2.year - a1.year);
        animalList.forEach((a) -> System.out.println("name: " + a.name + ", year: " + a.year));
        System.out.println();
        // animals alphabetically
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        animalList.forEach((a) -> System.out.println("name: " + a.name + ", year: " + a.year));
        System.out.println();
        // animals by how they move
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach((a) -> System.out.println("name: " + a.name + ", movement: " + a.move()));
        System.out.println();
        // only animals with breath: lungs, using custom class method
        printAnimal(animalList, a -> a.breath() == "lungs");
        System.out.println();
        // only animals with breath: lungs, and named in 1758
        printAnimal(animalList, a -> a.breath() == "lungs" && a.year == 1758);
        System.out.println();
        // only animals with breath: lungs, and reproduce: eggs
        printAnimal(animalList, a -> a.breath() == "lungs" && a.reproduce() == "eggs");
        System.out.println();
        // only animals named in 1758 and alphabetically
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        printAnimal(animalList, a -> a.year == 1758);
        System.out.println();
    }
}