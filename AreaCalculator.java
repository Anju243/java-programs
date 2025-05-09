class ShapeArea {

    double area(double radius) {
        return Math.PI * radius * radius;
    }


    double area(double length, double width) {
        return length * width;
    }

  
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

      
        double circleArea = shape.area(5); 
        System.out.println("Area of Circle: " + circleArea);

    
        double rectangleArea = shape.area(4, 6); 
        System.out.println("Area of Rectangle: " + rectangleArea);

       
        double triangleArea = shape.area(10, 5, true); 
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

