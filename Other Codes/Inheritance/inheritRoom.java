class Room {
    int l, b;

    // Correct constructor for Room class
    Room(int l1, int b1) {
        this.l = l1;
        this.b = b1;
    }

    // Method to calculate and print area
    void printArea() {
        System.out.println("Area of Room: " + (l * b));
    }
}

class Room1 extends Room {
    int h;

    // Correct constructor for Room1 class
    Room1(int l, int b, int h1) {
        super(l, b);  // Call to the parent class (Room) constructor
        this.h = h1;
    }

    // Method to calculate and print volume
    void printVolume() {
        System.out.println("Volume of Room1: " + (l * b * h));
    }
}

class inheritRoom {
    public static void main(String args[]) {
        // Correct object instantiation
        Room1 ob = new Room1(2, 3, 6);

        // Optionally call methods to print area and volume
        ob.printArea();    // Prints the area of the room
        ob.printVolume();  // Prints the volume of Room1
    }
}
