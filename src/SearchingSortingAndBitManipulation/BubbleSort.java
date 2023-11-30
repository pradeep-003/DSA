package SearchingSortingAndBitManipulation;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int []arr){
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            //for every iteration we get the biggest element in an array in the end.
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {20, 50, 10, 12, 45, 67, 90};
        //Function calling
        bubbleSort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}
