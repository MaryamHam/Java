import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //solution 2 average of three numbers
        Scanner read = new Scanner(System.in);
        System.out.println(" Please enter first number");
        double n1 = read.nextDouble();
        System.out.println(" Please enter second number");
        double n2 = read.nextDouble();
        System.out.println(" Please enter third number");
        double n3 = read.nextDouble();

        double avr = (n1 + n2 +n3)/ 3;
        System.out.println(" the average of three numbers is "+ avr);
    }
}