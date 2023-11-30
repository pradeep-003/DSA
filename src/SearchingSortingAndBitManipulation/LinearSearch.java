package SearchingSortingAndBitManipulation;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //number of elements in the array from the user
        System.out.println("Enter the number of Elements present in an array");
        int n = sc.nextInt();

        //array Elements entered from the user
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Target element from the user
        System.out.println("Enter Target Element");
        int x = sc.nextInt();

        // Implementation of linear Search
        int idx = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("Searched element Not found");
        }
        if(idx != -1){
            System.out.println("Searched element is present at index: "+ idx);
        }
    }
}
