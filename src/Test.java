import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};

       arr = rotateMatrix(arr);
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
        swap(arr);
    }
   public static int [][] rotateMatrix(int arr[][]){
        int swap; int n = arr[0].length; int m = arr.length;
        int prr[][] = new int[n][m];
        for(int i=0;i< m;i++){
            for(int j=0;j< n;j++){
                 prr[j][i] = arr[i][j];
            }
        }
return prr;
    }

    public static void swap(int [][]arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[0].length-1;
            while (li < ri) {
                swap = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = swap;
                li++;
                ri--;
            }

        }
            for(var mat:arr){
                System.out.println(Arrays.toString(mat));
            }

    }
}