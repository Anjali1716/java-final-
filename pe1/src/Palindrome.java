
import java.io.*;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Palindrome ob1 = new Palindrome();
        ob1.pallindromeMethod();
    }



        public void pallindromeMethod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:");
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        int rem, sum = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (original == rev)
            System.out.println("Pallindrome and");
        else
            System.out.println("Not Pallindrome and");


        while (original > 0) {

            rem = original % 10;
            original = original / 10;
            if (rem % 2 == 0) {
                sum = sum + rem;


            }
        }

        if (sum > 25)
            System.out.println("sum of even no. is greater than 25");
            else
            System.out.println("sum of even no. is less than 25");


    }
}

