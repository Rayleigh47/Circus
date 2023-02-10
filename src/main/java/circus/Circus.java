package circus;

import java.util.ArrayList;
import java.util.Arrays;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals: " + animals.length);
        makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));

//        animals[3] = new Parrot("Dolly");
//        System.out.println("Number of animals: " + animals.length);
        ArrayList <Animal> animalArray = new ArrayList<>(Arrays.asList(animals));
        animalArray.add(new Duck("Louie"));
        Parrot andy = new Parrot("Andy");
        Elephant strongOne = new Elephant("strong one");
        animalArray.add(andy);
        animalArray.add(strongOne);
        printAllAnimals(animalArray);
        animalArray.sort(Animal.AnimalNameComparator);
        printAllAnimals(animalArray);
        System.out.println("Position of andy: " + animalArray.indexOf(andy));
    }

    private static void printAllAnimals(ArrayList<Animal> animalArray) {
        for(Animal a: animalArray) {
            System.out.println(a);
        }
    }

}
