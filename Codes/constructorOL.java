class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }
}

class constructorOL {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.displayArea();

        Rectangle rect2 = new Rectangle(5);
        rect2.displayArea();

        Rectangle rect3 = new Rectangle(4, 7);
        rect3.displayArea();
    }
}
