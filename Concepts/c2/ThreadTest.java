package c2;

public class ThreadTest {
    public static void main(String[] args) {
        // HelloThread hello = new HelloThread();
        HiThread hi = new HiThread();
        for (int i = 0; i < 10; i++) {
            // hello.run();
            hi.start();
        }


    }
}
