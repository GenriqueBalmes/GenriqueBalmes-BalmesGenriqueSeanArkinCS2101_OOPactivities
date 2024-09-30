import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getNumberOfElements(scanner);
        int[] numbers = new int[n];
        fillArray(numbers, scanner);

        double mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f%n", mean);

        scanner.close();
    }

    public static int getNumberOfElements(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        return scanner.nextInt();
    }

    public static void fillArray(int[] numbers, Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public static double getArrayMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
