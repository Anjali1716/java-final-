import java.util.Scanner;

public class RepresentCase {

    public static void main(String[] args){

    RepresentCase ob1 = new RepresentCase();
    ob1.letter();
}

    public void letter(){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character to be checked:");
    char ch=sc.next().charAt(0);

    if(ch>=65 && ch<=90)
        System.out.println("Capital letter");
    else if(ch>=97 && ch<=122)
        System.out.println("Small case letter");
    else if(ch>=48 && ch<=57)
        System.out.println("Digit");
    //else if((ch>=0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127))
     else
        System.out.println("Special Character");


    }
}
