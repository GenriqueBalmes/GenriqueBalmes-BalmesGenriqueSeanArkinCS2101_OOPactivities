import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to CS 211: Object-oriented Programming");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name + ", This course will be fun.");

        scanner.close();
    }
}
