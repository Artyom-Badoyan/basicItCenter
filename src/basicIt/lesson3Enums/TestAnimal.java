package basicIt.lesson3Enums;

import jdk.swing.interop.SwingInterOpUtils;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        Animal animal1 = Animal.DOG;
        Animal animal2 = Animal.FROG;
        System.out.println(animal.getTranslation());
        System.out.println(animal1.getTranslation());
        System.out.println(animal2.getTranslation());
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal2);


        switch (animal) {
            case CAT:
                System.out.println("It is a cat");
                break;
        }

        switch (animal1) {
            case DOG:
                System.out.println("It is a dog");
                break;
        }


        switch (animal2) {
            case FROG:
                System.out.println("It is a frog");
                break;
        }
    }
}