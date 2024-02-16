package OOPS;

class Engine {
    int hp;
    float cc;

    Engine() {
        this.hp = 0;
        this.cc = 0;
    }

    Engine(int x) {
        this.hp = x;
        this.cc = 0;
    }

    Engine(int x, float y) {
        this.hp = x;
        this.cc = y;
    }

    @Override
    public String toString() {
        return ("Horse Power : " + this.hp + "\n" + "CC          : " + this.cc);
    }

    public boolean equals(Engine other) {
        return (this.hp == other.hp && this.cc == other.cc);
    }

}

public class PolyExample {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Engine e2 = new Engine(5, 300);
        Engine e3 = new Engine(5, 300);

        if (e2.equals(e3)) {
            System.out.println("Same engine");
        } else {
            System.out.println("Not same Engine");
        }

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
