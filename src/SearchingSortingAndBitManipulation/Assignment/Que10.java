package SearchingSortingAndBitManipulation.Assignment;

import java.util.Arrays;

public class Que10 {
    public static void selectionSort(int[] arr){
        int itr = 0;
        for(int i=0;i<arr.length-1;i++){
            itr++;
            int maxIdx = i;
            for(int j = i+1;j<arr.length;j++){
                itr++;
                if(arr[j]>arr[maxIdx]){
                    maxIdx = j;
                }
            }
            if(maxIdx != i){
                int swap = arr[maxIdx];
                arr[maxIdx] = arr[i];
                arr[i] = swap;
            }
        }

        System.out.println("Total number of iteration required is: "+ itr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //function calling
        selectionSort(arr);

        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
