package SearchingSortingAndBitManipulation.Assignment;

import java.util.Arrays;

public class Que6 {
    public static void main(String[] args) {
        int []arr = {3,5,1,6,0}; boolean swapped = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
