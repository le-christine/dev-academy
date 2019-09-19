package OOP;

public class ShapeCalc {
    public static void main(String[] args) {

        // Create triangle with sides 3,4,5
        Triangle newTriangle = new Triangle(3,4,5);
        System.out.println("Triangle" + getCircumferenceAndArea(newTriangle));

        // rectangle with length 4, height 5
        Rectangle newRectangle = new Rectangle(4,5);
        System.out.println("Rectangle" + getCircumferenceAndArea(newRectangle));

        // Circle with rad 4
        Circle newCircle = new Circle(4);
        System.out.println("Circle" + getCircumferenceAndArea(newCircle));

        // Sq side 4
        Square newSquare = new Square(4);
        System.out.println("Square" + getCircumferenceAndArea(newSquare));


    }
    // use this in main to get circumference and area for each shape
    private static String getCircumferenceAndArea(Shape shape) {
        String circumferenceAndArea = " has a circumference of " + shape.getCircumference()
                + " units and an area of " + shape.getArea() + " units.";
        return circumferenceAndArea;
    }
}
