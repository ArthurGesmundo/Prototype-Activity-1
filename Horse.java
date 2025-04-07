public class Horse implements Animal, Cloneable {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Horse(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    // Getter and Setter for name
    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone(); // Use Object's clone method
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
        return "Horse";
    }

    @Override
    public String toString() {
        return "Horse{name='" + name + "', legs=" + legs + ", sound='" + sound + "', food='" + food + "'}";
    }
}