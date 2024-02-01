package Recurrsion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    int findFact(int n) {
        int res;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            res = n * findFact(n - 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.findFact(n);
        System.out.println("The Factorial of the given number is: " + result);
    }
}
