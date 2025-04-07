public class AnimalRegistry {

    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry(Sheep sheepPrototype, Cow cowPrototype, Horse horsePrototype) {
        this.sheepPrototype = sheepPrototype;
        this.cowPrototype = cowPrototype;
        this.horsePrototype = horsePrototype;
    }

    /*public Animal createSheep(String name) {
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name); // Assuming Sheep has a setName method
        return clonedSheep;
    }
    public Animal createCow(String name) {
        Cow clonedCow = (Cow) cowPrototype.clone();
        clonedCow.setName(name); // Assuming Cow has a setName method
        return clonedCow;
    }
    public Animal createHorse(String name) {
        Horse clonedHorse = (Horse) horsePrototype.clone();
        clonedHorse.setName(name); // Assuming Horse has a setName method
        return clonedHorse;
    }*/
}