public class Sheep implements Animal, Cloneable {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone(); // Use Object's clone method
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Shouldn't happen since we implement Cloneable
        }
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String toString() {
        return "Sheep{name='" + name + "', legs=" + legs + ", sound='" + sound + "', food='" + food + "'}";
    }

}