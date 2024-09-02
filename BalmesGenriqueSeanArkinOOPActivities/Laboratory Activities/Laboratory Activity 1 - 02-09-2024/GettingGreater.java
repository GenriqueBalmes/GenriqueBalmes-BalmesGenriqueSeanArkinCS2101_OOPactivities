import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first character: ");
            char firstChar = scanner.next().charAt(0);

            System.out.print("Enter second character: ");
            char secondChar = scanner.next().charAt(0);

            char greaterChar = (char) Math.max((int) firstChar, (int) secondChar);

            // Displaying the results
            System.out.println("---------------------------------");
            System.out.println("The character with greater value is: " + greaterChar);
            System.out.println("---------------------------------");
            System.out.println("Showing the ASCII Codes:");
            System.out.println(firstChar + " : " + (int) firstChar);
            System.out.println(secondChar + " : " + (int) secondChar);
        }
    }
}
