package Arrays;

public class Palindrome0 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        int arr1[] = {1,2,3,2,1};
        int n = arr.length;
        for(int i = 0;i<n ; i++)
        {
            if( arr[i] != arr1[i])
            {
             System.out.println("not palindrome" );
             System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}
