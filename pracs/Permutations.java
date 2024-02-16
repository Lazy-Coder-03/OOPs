import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove white spaces
        char[] inputArray = inputString.replaceAll("\\s", "").toCharArray();

        // Generate permutations
        generatePermutations(inputArray, 0);

        scanner.close();
    }

    public static void generatePermutations(char[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = currentIndex; i < array.length; i++) {
                // Swap current element with each element after it
                char temp = array[currentIndex];
                array[currentIndex] = array[i];
                array[i] = temp;

                // Recursively generate permutations for the remaining elements
                generatePermutations(array, currentIndex + 1);

                // Swap back to restore the original order
                temp = array[currentIndex];
                array[currentIndex] = array[i];
                array[i] = temp;
            }
        }
    }
}
