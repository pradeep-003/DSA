package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5};
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.print("The reversed array is: ");
        for(int v:arr){
            System.out.print(v + " ");
        }
    }
}
