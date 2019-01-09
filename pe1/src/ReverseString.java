import java.util.Scanner;


public class ReverseString {

    public static void main(String[] args){

    ReverseString ob1 = new ReverseString();
    ob1.reverse();
    }

    public void reverse(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=sc.next();
        String rev="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            rev = rev + s1.charAt(i);

        }
        System.out.println(rev);
    }
}
