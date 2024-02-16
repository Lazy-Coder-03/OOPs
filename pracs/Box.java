import java.util.*;

public class Box {
    double l, b, h;

    public Box() {
        this.l = 0.0;
        this.b = 0.0;
        this.h = 0.0;
    }

    public Box(Box ob) {
        this.l = ob.l;
        this.b = ob.b;
        this.h = ob.h;
    }

    public double Volume() {
        double vol = l * b * h;
        return vol;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Box obj = new Box();
        System.out.println("Enter the length of box");
        obj.l = in.nextDouble();
        System.out.println("Enter the breadth of box");
        obj.b = in.nextDouble();
        System.out.println("Enter the height of box");
        obj.h = in.nextDouble();
        Box obj1 = new Box(obj);
        System.out.println("The volume of the box=" + obj1.Volume());
        in.close();
    }
}