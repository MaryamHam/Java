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



    }
}
