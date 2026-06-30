import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i ++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < size -1; i ++) {
            for (int j = i + 1; j < size; j ++) {
                if (array[i] + array[j] == target) {
                    
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Index 1: " + j);
                    System.out.println("Index 2: " + j);
                    System.out.println("Value 1: " + array[i]);
                    System.out.println("Value 2: " + array[j]);

                    System.out.println(
                        "Equation: " + array[i] + " + "
                        + array[j] + " = " + target
                    );

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
        }
    }

    if (!found) {
        System.out.println("\nNo pair found with sum: " + target);
    }

    scanner.close();
  }
}
