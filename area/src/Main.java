import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //solution 1 area and perimeter of circle
        //pi= 3.14
        System.out.println(" Please enter Radius of a circle");
        double r = read.nextDouble();
        double circleArea = 3.14 * r * r ;
        double circlePerimeter =2 * 3.14 *r;
        System.out.println("area of a circle is "+ circleArea);
        System.out.println("perimeter of a circle is "+ circlePerimeter);


        //solution 2 average of three numbers
        System.out.println(" Please enter first number");
        double n1 = read.nextDouble();
        System.out.println(" Please enter second number");
        double n2 = read.nextDouble();
        System.out.println(" Please enter third number");
        double n3 = read.nextDouble();

        double avr = (n1 + n2 +n3)/ 3;
        System.out.println(" the average of three numbers is "+ avr);


       // solution 3 area and perimeter of rectangle
        System.out.println(" Please enter width of rectangle");
        double w = read.nextDouble();
        System.out.println(" Please enter height of rectangle");
        double h = read.nextDouble();
        double rectangleArea = w * h;
        double rectanglePerimeter = (2 * w) +(2 * h);
        System.out.println("area of a rectangle is "+ rectangleArea);
        System.out.println("perimeter of a rectangle is "+ rectanglePerimeter);

        //solution 4 how to swap
        System.out.println(" Please enter first number");
          int num1 = read.nextInt();
          System.out.println(" Please enter second number");
          int num2 = read.nextInt();
          int y = num2 ;
          num2 =num1;
          System.out.println("first number is " + y);
        System.out.println("second number is " + num2);





    }
}