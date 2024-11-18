public class Dancer extends Artist {
    private DanceStyle danceStyle;

    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    public Dancer(String name, int age, String specialty, DanceStyle danceStyle) {
        super(name, age, specialty);
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    public String displayInfo() {
        return "Dancer's Info:\n" +
               super.displayInfo() + "\n" +
               "Dance Style: " + danceStyle;
    }
}
