import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Sorting ob1 = new Sorting();
        ob1.sortMethod();
    }

    public void sortMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n = sc.nextInt();
        int s = 0;
        int i = 0;
        int a[] = new int[n];
        System.out.print("enter array:");
        for ( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for ( i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
        }

        System.out.println("Sorted elements:");
        for ( i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


        while (n > 0) {

            a[i] = n % 10;
            a[i] = a[i] / 10;
            if (a[i] % 2 == 0) {
                s = s + a[i];


            }
        }

        if (s > 15)
            System.out.print("true");
        else
            System.out.print("false");


    }
}
