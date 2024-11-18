public class Dancer extends Artist {
    private DanceStyle danceStyle;

    // Enum
    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    // Constructor
    public Dancer(String name, int age, String specialty, DanceStyle danceStyle) {
        super(name, age, specialty);
        this.danceStyle = danceStyle;
    }

    // Getter
    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    @Override
    public String toString() {
        return "Dancer's Info:\n" +
                super.toString() + "\n" +
                "Dance Style: " + danceStyle;
    }
}
