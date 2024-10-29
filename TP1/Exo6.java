
import java.util.Scanner;

public class Exo6 {

    public static void main(String[] args) {
        int N, cpt = 0, sm = 0, nb = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Entrer la valeur de N");
            N = scanner.nextInt();
        } while (N <= 0);
        if (N > 1) {
            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    cpt++;
                    sm += i;
                }
            }
            if (cpt == 1) {
                System.out.println("Le nombre " + N + " est premier");
            }
            if (sm == N) {
                System.out.println("Le nombre " + N + " est parfait");
            }
            System.out.println("Les nombres premiers compris entre 1 et " + N + " sont :");
            for (int i = 1; i < N; i++) {
                cpt = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        cpt++;
                    }
                }
                if (cpt == 1) {
                    System.out.print(i + "\t");
                }
            }
            System.out.println("\nLes 2 premiers nombres parfais compris entre 1 et " + N + " sont :");
            for (int i = 1; i < N; i++) {
                sm = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        sm+=j;
                    }
                }
                if (sm == i) {
                    if (nb < 2) {
                        System.out.print(i + "\t");
                    }
                    nb++;
                }
            }
        }
    }
}
