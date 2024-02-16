class MainApp implements MainF, Add, Sub {
    public void mainF(int a,int b) {
        System.out.println("MainF: " + (a + b));
    }
    public void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
    public void sub() {
        System.out.println("Sub: " + (1 - 2));
    }    
}

public class App {
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.mainF(1, 2);
        app.add(5, 6);
        app.sub();
    }
}
