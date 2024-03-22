import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        int[] numbers = new int[3];

        Scanner input = new Scanner(System.in);

        for (int start = 0; start <= 2; start++) {

            numbers[start] = input.nextInt();

        }

        input.close();

        for (int number : numbers) {

            System.out.println(number);

        }

    }
}
