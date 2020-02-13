/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: Your Name
 Email: Your PSU email
*/

import java.util.Scanner;

public class Main
{
    private static final Scanner keyboard = new Scanner(System.in);

    public static void showOff(Animal animal) {
        System.out.println(animal.getName() + ":");
        System.out.println("  Speak: '" + animal.speak() + "'");
        System.out.println("  Fly: " + animal.fly());
        System.out.println();
    }

    public static void main(String[] args) {
        Animal dog = SimpleAnimalFactory.buildAnimal("dog");
        Animal cat = SimpleAnimalFactory.buildAnimal("cat");
        Animal bird = SimpleAnimalFactory.buildAnimal("bird");

        System.out.print("What weight pet? (heavy, medium, light): ");
        String petWeight = keyboard.nextLine();

        Animal pet = null;

        pet = SimpleAnimalFactory.buildAnimal(petWeight);

        pet.setName("Buddy");
        showOff(pet);

        /*
        dog.setName("Fido");
        showOff(dog);

        cat.setName("Toonces");
        showOff(cat);

        bird.setName("Tweety");
        showOff(bird);
       */
    }

}
