import java.io.*;
import java.util.Scanner;

public class Integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            sum=sum+n;
            n = sc.nextInt();
        }
        System.out.print(" "+sum);
    }



}




