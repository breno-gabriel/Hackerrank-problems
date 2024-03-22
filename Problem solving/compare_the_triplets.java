import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String alice, bob;

        String[] aliceScore = new String[3];
        String[] bobScore = new String[3];

        int[] aliceIntScore = new int[3];
        int[] bobIntScore = new int[3];

        int[] results = new int[2];

        String res;

        Scanner teclado = new Scanner(System.in);

        alice = teclado.nextLine();
        bob = teclado.nextLine();

        aliceScore = alice.split(" ");
        bobScore = bob.split(" ");


        for (int i = 0; i < 3; i++) {

            aliceIntScore[i] = Integer.parseInt(aliceScore[i]);
            bobIntScore[i] = Integer.parseInt(bobScore[i]);

        }

        for (int i = 0; i < 3; i++) {

            if (aliceIntScore[i] > bobIntScore[i]) {

                results[0] ++;

            }else if(aliceIntScore[i] < bobIntScore[i] ) {

                results[1] ++;

            }
        }

        res =  "" + results[0] + " " + results[1];

        System.out.println(res);
    }
}
