
package com.stackroute;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of matrix: ");
        int m1 = sc.nextInt();

        System.out.println("Enter no. of columns of matrix: ");
        int m2 = sc.nextInt();


        int first[][] = new int[m1][m2];
        int second[][] = new int[m1][m2];
        int sum[][] = new int[m1][m2];

        System.out.println("Enter elements of 1st matrix: ");
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < m2; j++)
                first[i][j] = sc.nextInt();

        System.out.println("Enter elements of 2nd matrix: ");
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < m2; j++)
                second[i][j] = sc.nextInt();


        for (int i = 0; i < m1; i++)
            for (int j = 0; j < m2; j++)
                sum[i][j] = first[i][j] + second[i][j];



        System.out.println("sum of matrices:");

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++)
                System.out.print(sum[i][j] + "\t");

            System.out.println();
        }
    }
}
