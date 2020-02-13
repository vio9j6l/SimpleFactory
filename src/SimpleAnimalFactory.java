public class SimpleAnimalFactory {
    public static Animal buildAnimal(String animalWeight) {
        Animal animalInstance = null;

        if (animalWeight.equals("heavy")) {
            animalInstance = new Dog();
        } else if (animalWeight.equals("medium")) {
            animalInstance = new Cat();
        } else if (animalWeight.equals("light")) {
            animalInstance = new Bird();
        }
        return animalInstance;

    }
}
