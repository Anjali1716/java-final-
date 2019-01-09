import java.util.Scanner;

public class PallindromeP2 {
    public static void main(String[] args){

        PallindromeP2 ob1=new PallindromeP2();
        ob1.reversePallindrome();


    }


    public void reversePallindrome(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.:" );
        int n=sc.nextInt();
        int rev=0,rem;
        int or=n;

        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println("Reversed no.:"+ rev);
        if(rev==or) {
            System.out.println("Pallindrome");
        }
            else{
            System.out.println("Not Pallindrome");
        }

    }
}
