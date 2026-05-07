interface Drawable {
    void draw();  // Abstract method

    default void printInfo() {  // Default method
        System.out.println("Drawable object");
    }

    static void displayVersion() {  // Static method
        System.out.println("Drawable v1.0");
    }
}

interface Scalable {
    void scale(double factor);
}

// Implementing multiple interfaces
class Circle implements Drawable, Scalable {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius " + radius);
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}
class InterfaceTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        c.draw();
        c.scale(2);
        c.draw();
        c.printInfo();

        Drawable.displayVersion();
    }
}