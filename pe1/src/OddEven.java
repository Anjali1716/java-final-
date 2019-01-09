import java.io.*;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        OddEven ob1 = new OddEven();
        ob1.oddEvenMethod();
    }


        public void oddEvenMethod()
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no.:");
            int n = sc.nextInt();


            if ((n % 2 != 0) && (n > 20 && n < 30))

                System.out.println("TOM");
            else if ((n % 2 == 0) && (n > 20 && n < 30))
                System.out.println("JERRY");
        }
    }
