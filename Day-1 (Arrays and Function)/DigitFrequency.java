

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int number = s.nextInt();
        int ans = frequency(input, number);
        System.out.println(ans);


    }

    public static int frequency(int input, int number) {

        int count = 0;
        while (input != 0) {
            int digit = input % 10;
            input = input / 10;
            if (digit == number) {
                count++;
            }


        }
        return count;
    }






}
