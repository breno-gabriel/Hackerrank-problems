import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        int denominador = arr.size(); 
        float positivo = 0; 
        float negativo = 0; 
        float zero = 0; 
        
        for (int number: arr) {
            
            if (number > 0) {
                
                positivo ++; 
                
            }else if (number < 0) {
                
                negativo++; 
                
            }else {
                
                zero++; 
                
            }
            
        }
        
        
        System.out.println(positivo/denominador);
        System.out.println(negativo/denominador);
        System.out.println(zero/denominador);
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}