

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int p = s.nextInt();
double ans = permutation(n,p);
        System.out.println(ans);


    }
    public static double permutation(int n , int p){
        double result = factorial(n)/factorial(n-p);
        return result;

    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        int mul = num * factorial(num-1);
        return mul;

    }
}
