import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// to sign up
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Sign up system, please enter your data");
        System.out.println("please enter your name");
        String name = read.next();
        System.out.println("please enter your email");
        String email = read.next();
        System.out.println("please enter your phone number");
        int phone = read.nextInt();
        System.out.println("please enter your birth Date in YYYY-MM-DD format:");
        Scanner scanner = new Scanner(System.in);
        String birthDate = scanner.nextLine();
        System.out.println("please enter your password");
        String password = read.next();
        System.out.println("please enter to confirm your password ");
        String confirmPassword = read.next();
        if(password.equals(confirmPassword)){
            System.out.println("sign up successful");
            LocalDate dateOfBirth = LocalDate.parse(birthDate);
            LocalDate currentDate = LocalDate.now();
            System.out.println(Period.between(dateOfBirth, currentDate).getYears() );
        }else {
            System.out.println("sign up fail");
        }

    }
}
