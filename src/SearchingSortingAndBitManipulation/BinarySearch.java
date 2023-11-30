package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int []arr,int target){
        int low = 0; int high = arr.length-1; int mid = 0;

        while(low <= high){
            mid = low + ((high-low)/2);
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //number of elements in the array from the user
        System.out.println("Enter the number of Elements present in an array");
        int n = sc.nextInt();

        //array Elements entered from the user
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Target element from the user
        System.out.println("Enter Target Element");
        int x = sc.nextInt();

        //Function calling
        int result = binarySearch(arr, x);

        if(result == -1){
            System.out.println("Searched element Not found");
        }
        if(result != -1){
            System.out.println("Searched element is present at index: "+ result);
        }
    }
}
