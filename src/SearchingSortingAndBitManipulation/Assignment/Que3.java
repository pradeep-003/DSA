package SearchingSortingAndBitManipulation.Assignment;

// Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
public class Que3 {
    public static void main(String[] args){
        int []arr = {0, 0, 0, 0, 0, 1, 1};

        int low = 0; int mid = 0; int res = -1;
        int high = arr.length-1;
        while(low <= high){
            mid = (low + high) / 2;
            if(arr[mid] == 0){
                res = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        int NoOf1_s = arr.length - 1 - res;
        System.out.println("The total no. of 1's in an sorted Binary array is: " + NoOf1_s);
    }
}
