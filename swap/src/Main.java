import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

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