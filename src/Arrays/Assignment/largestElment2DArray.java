package Arrays.Assignment;
import java.io.*;
import java.util.*;

class Largest{
    public int lar2D(int [][]arr,int m,int n){
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
               largestElement = Math.max(largestElement,arr[i][j]);
            }
        }
        return largestElement;
    }
}
public class largestElment2DArray {
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


        Largest lar = new Largest();
         int l = lar.lar2D(arr,m,n);
        System.out.println("largest element of 2D array is = " + l);
    }
}




