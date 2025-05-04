package Prototype_Method;

public class Main {
    public static void main(String[] args) {
        AnimalCreator creator = new AnimalCreator();

        Animal clonedChicken = creator.retrieveAnimal("Chicken");
        System.out.println(clonedChicken.helloAnimal());

        Animal clonedSheep = creator.retrieveAnimal("Sheep");
        System.out.println(clonedSheep.helloAnimal());
    }
}

