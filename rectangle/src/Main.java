import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // solution 3 area and perimeter of rectangle
        Scanner read = new Scanner(System.in);

        System.out.println(" Please enter width of rectangle");
        double w = read.nextDouble();
        System.out.println(" Please enter height of rectangle");
        double h = read.nextDouble();
        double rectangleArea = w * h;
        double rectanglePerimeter = (2 * w) +(2 * h);
        System.out.println("area of a rectangle is "+ rectangleArea);
        System.out.println("perimeter of a rectangle is "+ rectanglePerimeter);

    }
}