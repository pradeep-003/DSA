import java.util.Arrays;

public class Test {
    public static void Test(){
        int r = 12, s = 13, p = 12;
        System.out.println(s);
    }
    public static void palindrome(){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                System.out.println("Not palindrome");
            }
        }

    }

    public static void reversedArray(int []arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int swap = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=swap;
        }
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        reversedArray(arr);
//        for (int img:arr){
//            System.out.print(img + " ");
//        }
    }
}
