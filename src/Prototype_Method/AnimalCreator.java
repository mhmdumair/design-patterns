package Prototype_Method;

public class AnimalCreator {
    private Animal sheep = new Sheep();
    private Animal chicken = new Chicken();

    public AnimalCreator() {
        sheep.setName("Sheep");
        sheep.setNumberOfLegs(4);
        sheep.setDescription("Four legged creature that makes wool.");

        chicken.setName("Chicken");
        chicken.setNumberOfLegs(2);
        chicken.setDescription("Two legged creature that crosses roads.");
    }

    public Animal retrieveAnimal(String kindOfAnimal) {
        if ("Chicken".equalsIgnoreCase(kindOfAnimal)) {
            return chicken.clone();
        } else if ("Sheep".equalsIgnoreCase(kindOfAnimal)) {
            return sheep.clone();
        }
        return null;
    }
}

