package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class SquareRoot {

    public static int sqrt(int arr[], int x){
        int high = arr.length-1;int low = 0;int mid = 0;int result = 0;
        while(low <= high){
            mid = low + ((high-low)/2);
            if(x == mid*mid){
                return mid;
            } else if (x < mid*mid) {
                high = mid-1;
            }
            else{
                result = mid;
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to square root");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = i;
        }


        //Function calling
        int result = sqrt(arr, x);
        System.out.println("The sqrt of "+ x + " is "+result);
    }
}
