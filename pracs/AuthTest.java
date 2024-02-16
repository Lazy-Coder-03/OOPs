import java.util.Scanner;

public class AuthTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = sc.nextLine();
        System.err.print("Enter Password : ");
        String password = sc.nextLine();
        Auth.authorize(username, password);
        sc.close();
    }
}

class Auth {
    static void authorize(String username, String password) {
        try {
            if (username.isEmpty() || password.isEmpty()) {
                throw new NullPointerException("User input cannot be empty");
            } else if (username.equals("Sayantan") && password.equals("root")) {
                System.out.println("User is Authorized");
            } else {
                throw new AuthException("User not Authorized");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class NullPointerException extends Exception {
    NullPointerException(String msg) {
        super(msg);
    }
}

class AuthException extends Exception {
    AuthException(String msg) {
        super(msg);
    }
}