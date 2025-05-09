import java.util.Scanner;


interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f\n", area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter of Circle: %.2f\n", perimeter);
    }
}


class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double area = length * breadth;
        System.out.printf("Area of Rectangle: %.2f\n", area);
    }

    public void perimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.printf("Perimeter of Rectangle: %.2f\n", perimeter);
    }
}


public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of the rectangle: ");
                    double breadth = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    rectangle.area();
                    rectangle.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}

