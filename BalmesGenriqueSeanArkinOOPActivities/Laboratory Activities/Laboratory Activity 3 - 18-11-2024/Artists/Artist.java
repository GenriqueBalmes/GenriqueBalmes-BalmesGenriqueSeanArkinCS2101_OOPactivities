public class Artist {
    private String name;
    private int age;
    private String specialty;

    // Constructor
    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Artist Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Specialty: " + specialty;
    }
}
