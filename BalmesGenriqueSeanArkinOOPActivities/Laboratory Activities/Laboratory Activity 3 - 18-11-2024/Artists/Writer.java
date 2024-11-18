public class Writer extends Artist {
    private WritingStyle writingStyle;

    // Enum
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    // Constructor
    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    // Getter
    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    @Override
    public String toString() {
        return "Writer's Info:\n" +
                super.toString() + "\n" +
                "Writing Style: " + writingStyle;
    }
}
