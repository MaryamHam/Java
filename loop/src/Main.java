public class Main {
    public static void main(String[] args) {
        //uses of loop is counter

     //increment  Pre- & Post-
        int n = 10;
        System.out.println(n);
        System.out.println(n++);
        System.out.println(++n);
        System.out.println(n);


     // for loop get even number
        for (int i =1; i <= 100; i++){
            //even
            if( i % 2 ==0){
                System.out.println("even number is " + i);
            }

        }

       //while loop to get odd number
        int x= 1;
        while (x <= 100 ){
            //
            if(x % 2 == 1) {
                System.out.println("odd number is " + x);

            }
            x++;

        }

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