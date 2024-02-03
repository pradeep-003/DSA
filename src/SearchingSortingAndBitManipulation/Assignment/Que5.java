package SearchingSortingAndBitManipulation.Assignment;

import java.util.Scanner;

class Sqrt{
    public  int  sqrt(int x){
        int low =0 ; int high = x-1; int mid;
        while(low <= high){
            mid = (low + high)/2;
            if(mid*mid == x){
                return mid;
            }else if(mid*mid<x){
                low =  mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want the square root :");
        int n = sc.nextInt();
        Sqrt sq = new Sqrt();
        int k =sq.sqrt(n);
        if(k == -1){
            System.out.println("Square root of the desired element is not integer" );
        }else{
            System.out.println("Square root of the desired element is: " + k);
        }
    }
}
