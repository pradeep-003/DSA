package SearchingSortingAndBitManipulation.Assignment;
/*
Q4. Find out how many pass would be required to sort the following array in decreasing order

        using bubble sort

        Input Array {3,5,1,6,0}

 */

import java.util.Arrays;

public class Que9 {
    public static void main(String[] args) {
        int []arr = {3, 5, 1, 6, 0};  int pass = 0;
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    swapped = true;
                }else{
                    pass++;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("total number of passes: "+pass);
    }
}
