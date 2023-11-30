package SearchingSortingAndBitManipulation;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIdx = i;
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int swap = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = swap;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 50, 25, 67, 69, 57, 83};
        //function calling
        selectionSort(arr);

        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
