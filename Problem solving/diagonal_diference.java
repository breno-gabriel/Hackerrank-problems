import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
        int[][] matrix = new int[num][num];

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int numero = teclado.nextInt();
                matrix[i][j] = numero;

                // Soma da diagonal principal (i == j)
                if (i == j) {
                    diagonalPrincipal += numero;
                }

                // Soma da diagonal secundária (i + j == num - 1)
                if (i + j == num - 1) {
                    diagonalSecundaria += numero;
                }
            }
        }

        teclado.close();

        // Calculando a diferença absoluta entre as somas das diagonais
        int diferencaAbsoluta = Math.abs(diagonalPrincipal - diagonalSecundaria);
        System.out.println(diferencaAbsoluta);
    }
}
