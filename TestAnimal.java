public class TestAnimal {
    public static void main(String[] args) {
        Sheep originalSheep = new Sheep(4, "Baa", "Grass", "Dolly");
        System.out.println("Original: " + originalSheep);

        Sheep clonedSheep = originalSheep.clone();
        System.out.println("Cloned: " + clonedSheep);

        Cow originalCow = new Cow(4, "moo", "Grass", "Parton");
        System.out.println("Original: " + originalCow);

        Cow clonedCow = originalCow.clone();
        System.out.println("Cloned: " + clonedCow);

        Horse originalHorse = new Horse(4, "neigh", "Hay", "Spirit");
        System.out.println("Original: " + originalHorse);
        
        Horse clonedHorse = originalHorse.clone();
        System.out.println("Cloned: " + clonedHorse);
    }
}