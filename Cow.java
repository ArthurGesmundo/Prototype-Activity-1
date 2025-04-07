public class Cow implements Animal, Cloneable {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Cow(int legs, String sound, String food, String name) {
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
    public Cow clone() {
        try {
            return (Cow) super.clone(); // Use Object's clone method
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
        return "Cow";
    }

    @Override
    public String toString() {
        return "Cow{name='" + name + "', legs=" + legs + ", sound='" + sound + "', food='" + food + "'}";
    }
}