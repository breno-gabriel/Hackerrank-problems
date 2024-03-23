import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        long sum = 0;

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();
        String entrada = teclado.nextLine();

        teclado.close();

        String[] numb = new String[n];

        numb = entrada.split(" ");

        for (String numero: numb) {

            sum = sum + Long.parseLong(numero);

        }

        System.out.println(sum);

    }
}