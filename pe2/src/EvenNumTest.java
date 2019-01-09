import java.util.Scanner;

public class EvenNumTest {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.:");

        int a=sc.nextInt();

        while(a!=1){
            if(isEven(a)) {
                System.out.println(a + "is even");
            }
                else{
                System.out.println(a+"not even");
            }
        }

    }
    public static boolean isEven(int n){
        if(n%2==0)
            return true;
        else
            return false;

    }




}
