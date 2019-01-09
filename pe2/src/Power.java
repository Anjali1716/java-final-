import java.util.Scanner;


public class Power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to be checked of Power of 4:");

        int n = sc.nextInt();

        if (powerFour(n) == 1) {
            System.out.println("Is power of 4");

        } else {
            System.out.println("Is not power of 4");
        }

    }


    public static int powerFour(int n) {


        if (n == 0)
            return 0;


        while (n != 1) {

            if (n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;
    }
}









