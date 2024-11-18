public class Writer extends Artist {
    private WritingStyle writingStyle;

    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public String displayInfo() {
        return "Writer's Info:\n" +
               super.displayInfo() + "\n" +
               "Writing Style: " + writingStyle;
    }
}
