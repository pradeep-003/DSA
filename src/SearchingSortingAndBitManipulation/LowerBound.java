package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class LowerBound {
    public static int findFirstOccurrence(int []arr,int target){
        int low = 0; int high = arr.length-1; int mid = 0; int result = -1;

        while(low <= high){
            mid = low + ((high-low)/2);
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            } else if (arr[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
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

        int result = findFirstOccurrence(arr, x);

        if(result == -1){
            System.out.println("Searched element Not found");
        }
        if(result != -1){
            System.out.println("Searched element first occurrence is at index: "+ result);
        }
    }
}
