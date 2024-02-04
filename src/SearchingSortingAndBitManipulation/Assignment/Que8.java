package SearchingSortingAndBitManipulation.Assignment;

//Q3. WAP to sort an array in decreasing order using insertion sort
//
//        Input Array {3,5,1,6,0}
//
//        Output Array: {6, 5, 3, 1, 0}

import java.util.Arrays;

public class Que8 {
    public static void main(String[] args) {
        int []arr = {3,5,1,6,0};
        for(int i=0;i< arr.length;i++){
            int j = i;
            while(j>0 && arr[j]>arr[j-1]){
                int swap = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = swap;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
