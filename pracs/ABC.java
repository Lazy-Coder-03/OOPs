import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input and remove white spaces
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine().replaceAll("\\s", "");

        for (int i = 0; i < userInput.length(); i++) {
            String ns = "";
            for (int j = 0; j < userInput.length(); j++) {
                if (i != j) {
                    char ch = userInput.charAt(i);
                    ns = Character.toString(ch);
                    ns = ns + Character.toString(userInput.charAt(j));
                    if ((i + j) == 1)
                        ns = ns + Character.toString(userInput.charAt(2));
                    else if ((i + j) == 2)
                        ns = ns + Character.toString(userInput.charAt(1));
                    else
                        ns = ns + Character.toString(userInput.charAt(0));
                    System.out.println(ns);
                }
            }
        }
        sc.close();
    }
}
