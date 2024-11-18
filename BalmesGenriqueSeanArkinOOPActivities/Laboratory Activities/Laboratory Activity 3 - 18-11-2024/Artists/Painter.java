public class Painter extends Artist {
    private Medium medium;

    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    public Painter(String name, int age, String specialty, Medium medium) {
        super(name, age, specialty);
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public String displayInfo() {
        return "Painter's Info:\n" +
               super.displayInfo() + "\n" +
               "Medium: " + medium;
    }
}
