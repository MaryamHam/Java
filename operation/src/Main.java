import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //operator logic
        int v1 = 11;
        int v2 = 7;

        System.out.println(v1 > v2 || v1 < v2);
        System.out.println(true && true || true || true && false);
        System.out.println(!(!(true && false) || false) ||true && false || true);


       //  if statement
        if (v1 > v2){
            System.out.println("v1 is grater than v2" );
        }
        else {
            System.out.println(" v1 is smaller than v2" );
        }

        // else if statement
        System.out.println(" Please enter first number");
        int number1 = read.nextInt();
        System.out.println(" Please enter second number");
        int number2 = read.nextInt();
        System.out.println(" Please enter third number");
        int number3 = read.nextInt();


        if (number1 > number2 && number1 > number3){
            System.out.println("First number is the greatest" );
        }
        else if(number2 > number3 && number2 > number1) {
            System.out.println("Second number is the greatest" );
        }
        else if(number3 > number1 && number3 > number2) {
            System.out.println("Third number is is the greatest" );
        }else {
            System.out.println(" error" );
        }

        //get grade
         System.out.println(" Please enter your grade in Math");
        int gradeM = read.nextInt();
        System.out.println(" Please enter your grade in Arabic");
        int gradeA = read.nextInt();
        System.out.println(" Please enter your grade in Islamic");
        int gradeI = read.nextInt();
        System.out.println(" Please enter your grade in History");
        int gradeH = read.nextInt();
        System.out.println(" Please enter your grade in English");
        int gradeE = read.nextInt();
        int result;

        result = (gradeM + gradeA + gradeI + gradeH + gradeE)/5;
        System.out.println("your total grade is "+ result);


            if (100 >= result && result >=90){
                System.out.println("Your grade is A " );
            }
            else if(90 > result && result >=80) {
                System.out.println("Your grade is B  "  );
            }
            else if(80 > result && result >=70) {
                System.out.println("Your grade is  C ");
            }
            else if(70 > result && result >=60) {
                System.out.println("Your grade is D ");
            }else {
                System.out.println("Your grade is F ");
            }


    }
}
