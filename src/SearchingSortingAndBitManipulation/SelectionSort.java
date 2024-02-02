package SearchingSortingAndBitManipulation;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j = i+1;j<arr.length;j++){
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
        int arr[] = {5,4,3,2,1};
        //function calling
        selectionSort(arr);

        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
