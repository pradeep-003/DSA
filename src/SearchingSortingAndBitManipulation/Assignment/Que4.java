package SearchingSortingAndBitManipulation.Assignment;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        System.out.println("Enter the target element: ");
        int x = sc.nextInt();
        int low = 0; int high = arr.length - 1;
        int mid = 0; int sum = 0;
        while (low <= high){
            mid = (low + high) / 2;
            if(arr[mid] == x){
                ++sum; int i = mid;
                while (mid< arr.length-1  ) {
                    if(arr[mid + 1] == x){
                        ++sum;
                        ++mid;
                    }else{
                    break;
                    }
                }
                while(i >0){
                    if(arr[i - 1] == x){
                         ++sum;
                        --i;

                    }else{
                        break;
                    }
                }
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        System.out.println("Total No. of " + x + "'s present in given array is: " + sum);
    }
}
