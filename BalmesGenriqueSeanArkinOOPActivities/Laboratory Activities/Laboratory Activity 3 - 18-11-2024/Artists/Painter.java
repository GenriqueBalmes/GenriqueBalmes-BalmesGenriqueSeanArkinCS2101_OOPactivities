public class Painter extends Artist {
    private Medium medium;

    // Enum
    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    // Constructor
    public Painter(String name, int age, String specialty, Medium medium) {
        super(name, age, specialty);
        this.medium = medium;
    }

    // Getter
    public Medium getMedium() {
        return medium;
    }

    @Override
    public String toString() {
        return "Painter's Info:\n" +
                super.toString() + "\n" +
                "Medium: " + medium;
    }
}
