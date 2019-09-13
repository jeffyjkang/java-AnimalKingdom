package animalKingdom;

import java.util.*;

public class Main {
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

        System.out.println(panda);
        System.out.println(zebra);
        System.out.println(pigeon);
        System.out.println(panda.getNumber());
        System.out.println(zebra.getNumber());
        System.out.println(pigeon.getNumber());
        System.out.println(armadillo.move());
        System.out.println(toucan.breath());
        System.out.println(salmon.reproduce());
    }
}