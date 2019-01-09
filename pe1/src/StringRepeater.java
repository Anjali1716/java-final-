import java.util.Scanner;

public class StringRepeater {

    public static void main(String[] args){
        StringRepeater ob1=new StringRepeater();
        ob1.repeat();

    }

    public void repeat(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:");

        String s=sc.next();
        System.out.println("Enter no. to repeat:");
        int n=sc.nextInt();

        int index=s.length()-n;
        if(index>=0) {
            String s1 = s.substring(index);

            for (int i = 0; i <= n; i++) {
                s = s + s1;

            }
            System.out.println(s);
        }
            else{
                System.out.println("out of index");
        }

    }
}
