package Arrays;

public class Palindrome
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;
        for(int i=0; i<n/2; i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                System.out.println("not palindromic array");
                System.exit(0);
            }
        }
        System.out.println("Palindromic array");
    }
}
