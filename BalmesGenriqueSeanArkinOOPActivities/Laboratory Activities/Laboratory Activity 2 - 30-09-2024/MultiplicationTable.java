import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = getTableSize(scanner);
        int[][] table = createMultiplicationTable(size);
        printMultiplicationTable(table);

        scanner.close();
    }

    public static int getTableSize(Scanner scanner) {
        System.out.print("Enter the size of the multiplication table: ");
        return scanner.nextInt();
    }

    public static int[][] createMultiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static void printMultiplicationTable(int[][] table) {
        System.out.println("Multiplication Table:");
        for (int[] row : table) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
