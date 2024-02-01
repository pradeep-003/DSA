package Arrays.Assignment;

import java.util.Scanner;

public class MiddelRowAndColumnElement {

    public void Middle(int [][]arr, int m, int n){
        int i = m/2; int k = 0; int j = n/2;
        System.out.print("Middle elements is : ");
        while(k<n || k <m){
            if(m > n && k <= n-1){
                System.out.print(arr[i][k] + " ");
            }
            if(m >= n){
                if(k != i) {
                    System.out.print(arr[k][j] + " ");
                }
            }
            if(m <= n){
                System.out.print(arr[i][k] + " ");
            }
            if(m < n && k <= m-1){
                if(k != i) {
                    System.out.print(arr[k][j] + " ");
                }
            }
            k++;
        }

    }
    public static void main(String args[]) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m = sc.nextInt();
        System.out.print("enter the number of column : ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];

        int i, j;

        System.out.println("enter the  matrix element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        MiddelRowAndColumnElement mi = new MiddelRowAndColumnElement();
        mi.Middle(arr, m, n);
    }
}
