package Arrays;

//Modification for Overflow: The approach remains the same but there can be an overflow if N is large. In order
//to avoid integer overflow, pick one number from the range [1, N] and subtract a number from the given array
//(don’t subtract the same number twice). This way there won’t be any integer overflow

public class MissingElement1
{
    static int missingNumber(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;

        // Function call
        System.out.println("The missing number is " + missingNumber(arr, N));
    }
}