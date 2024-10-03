//method ol
import java.util.Scanner;

class Area {
    double number;
    int number1, number2;

    void cal(int a1, int a2) {
        this.number1 = a1;
        this.number2 = a2;
        System.out.println("Area of rectangle: " + (number1 * number2));
    }

    void cal(double a3) {
        this.number = a3;
        System.out.println("Area of circle: " + (3.14 * number * number));
    }

    void cal(float number) {
        System.out.println("Area of square: " + (number * number));
    }
}

class OL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area ob = new Area();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        ob.cal(length, breadth);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        ob.cal(radius);

        System.out.print("Enter side of square: ");
        float side = sc.nextFloat();
        ob.cal(side);
    }
}