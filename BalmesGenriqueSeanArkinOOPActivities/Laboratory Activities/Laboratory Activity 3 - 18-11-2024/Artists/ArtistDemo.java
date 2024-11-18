public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        System.out.println(artist.displayInfo() + "\n");

        Singer singer = new Singer("Nayeon Im", 29, "Music", Singer.Genre.POP);
        System.out.println(singer.displayInfo() + "\n");

        Dancer dancer = new Dancer("Mikhail Baryshnikov", 75, "Dance", Dancer.DanceStyle.CONTEMPORARY);
        System.out.println(dancer.displayInfo() + "\n");

        Painter painter = new Painter("Frida Kahlo", 47, "Painting", Painter.Medium.ACRYLIC);
        System.out.println(painter.displayInfo() + "\n");

        Writer writer = new Writer("George Orwell", 46, "Writing", Writer.WritingStyle.FICTION);
        System.out.println(writer.displayInfo() + "\n");
    }
}
