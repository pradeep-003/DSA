package Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 5};
        int n = arr.length;
        int sumOfArr = 0;
        int sumOfNaturalNum = ((n+1)*(n+2)) / 2;
        for(int v:arr){
            sumOfArr += v;
        }
        int missing = sumOfNaturalNum - sumOfArr;
        System.out.println("Missing number is: " + missing);
    }
}
