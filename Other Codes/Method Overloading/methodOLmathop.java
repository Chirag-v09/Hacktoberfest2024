//method overloading

class MathOperations {
    static int square(int number) {
        return number * number;
    }
    static double square(double number) {
        return number * number;
    }
    static int square(int number1, int number2) {
        return number1 * number2;
    }
}

class methodOLmathop {
    public static void main(String[] args) {
        System.out.println(MathOperations.square(2));
        System.out.println(MathOperations.square(3.5));
        System.out.println(MathOperations.square(2, 3));
    }
}
