package SearchingSortingAndBitManipulation.Assignment;

import java.util.Scanner;

// Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
//         not present return -1.
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //number of elements in the array from the user
        System.out.println("Enter the number of Elements present in an array");
        int n = sc.nextInt();

        //array Elements entered from the user
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Target element from the user
        System.out.println("Enter Target Element");
        int x = sc.nextInt();

        int res = -1;

        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                res = i;
            }
        }

        System.out.println("The last index of element is found at " + res);
    }
}
