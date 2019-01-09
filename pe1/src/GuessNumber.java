import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

    public static void main(String[] args){

        GuessNumber ob1 = new GuessNumber();
        ob1.guessMethod();
    }

    public void guessMethod() {

        Random rand= new Random();
        int no_guess=rand.nextInt(100);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter original no.:");
        int n=sc.nextInt();

        System.out.println("Enter Number between 1 to 100:");
        int guessnum=sc.nextInt();

        if(guessnum>n) {
            System.out.println("Number guessed is more than original number");
        }
            else if(guessnum<n) {

            System.out.println("Number guessed is less than original number");
        }
            else if(guessnum==n){

            System.out.println("Number guessed matches original number");
            }

        }


    }


