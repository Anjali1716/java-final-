import java.io.*;
import java.util.Scanner;

public class ConsonantVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet:");
        char ch = sc.next().charAt(0);


        /*
        for (int i = 0; i <= s1.length(); i++) {
        String s1 = sc.next();
        char ch1 = s1.charAt(i);
        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A'
        || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {

        System.out.println("Vowel");
        } else {
        System.out.println("consonant");
        }
        }

        */


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

            {
                System.out.println("Vowel");

            }
            else{
                System.out.println("Constant");
            }


        }

    }

