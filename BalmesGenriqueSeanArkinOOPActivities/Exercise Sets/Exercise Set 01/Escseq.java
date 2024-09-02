public class AlternatingTabs {
    public static void main(String[] args) {
        int numberOfMultiples = 10;

        for (int i = 1; i <= numberOfMultiples; i++) {
            int multipleOf7 = i * 7;

            if (i % 2 == 0) {
                System.out.println("\t" + multipleOf7);
            } else {
                System.out.println(multipleOf7);
            }
        }
    }
}
