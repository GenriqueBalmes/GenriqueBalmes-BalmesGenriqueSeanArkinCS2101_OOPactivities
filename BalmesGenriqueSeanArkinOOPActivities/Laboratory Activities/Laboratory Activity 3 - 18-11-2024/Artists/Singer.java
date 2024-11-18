public class Singer extends Artist {
    private Genre genre;

    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    public Singer(String name, int age, String specialty, Genre genre) {
        super(name, age, specialty);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String displayInfo() {
        return "Singer's Info:\n" +
               super.displayInfo() + "\n" +
               "Genre: " + genre;
    }
}
