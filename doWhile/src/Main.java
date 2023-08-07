

public class Main {
    public static void main(String[] args) {
        //do while loop to get primary number
        int y = 1;
        do {
            if(y != 1
                    && y % 2 != 0
                    && y % 3 != 0
                    && y % 5 != 0
                    && y % 7 != 0
                    || y == 2
                    || y == 3
                    || y == 5
                    || y == 7
            ) {

                System.out.println("primary number is " + y);
            }

            y++;
        }while (y <= 100);
    }
}