package SearchingSortingAndBitManipulation.Assignment;
import java.util.Arrays;

//Q2. WAP to sort an array in descending order using selection sort
//
//        Input Array {3,5,1,6,0}
//
//        Output Array: {6, 5, 3, 1, 0}

public class Que7{
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxIdx = i;
            for(int j = i+1;j<arr.length;j++){
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
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        //function calling
        selectionSort(arr);

        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
