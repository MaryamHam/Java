import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //reverse word in sentence
        System.out.println(" please enter sentence");
        String input = read.nextLine();
        String [] word = input.split(" ");

        System.out.println( " reverse word is :  ");
        for( int i = word.length-1; i>= 0; i--){
            System.out.print( word [i]+ " ");


        }


    }
}