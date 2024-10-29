

import java.util.Scanner;


public class Exercice1 {

    static Scanner sc = new Scanner(System.in);

    public static int saisiTaille() {
        int n;
        do {
            System.out.println("Entrer la taille du tableau");
            n = sc.nextInt();
        } while (n <= 0);
        return n;

    }

    public static void saisiTableau(int T[], int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrer la " + (i + 1) + "e valeur");
            T[i] = sc.nextInt();
        }
    }

    public static void afficheTableau(int T[], int taille) {
        System.out.println("Affichage des elements du tableau");
        for (int i = 0; i < taille; i++) {
            System.out.print(T[i] + "\t");
        }
        System.out.println("");
    }

    public static int verifParfait(int N) {
        int sm = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                sm += i;
            }
        }
        if (sm == N) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void transfere(int T[], int T1[], int T2[], int taille, int Tai[]) {
        Tai[0]=0;
        Tai[1]=0;
        for (int i = 0; i < taille; i++) {
            if (T[i] % 2 == 0) {
                T1[Tai[0]] = T[i];
                Tai[0]++;
            }
            if (verifParfait(T[i])==1) {
                    T2[Tai[1]] = T[i];
                    Tai[1]++;
            }
        }
    }

    public static void main(String[] args) {
        int taille = 4;
        int T[] = new int[taille];
        int Tai[] = new int[2];
        int T1[] = new int[taille];
        int T2[] = new int[taille];
        saisiTableau(T, taille);
        afficheTableau(T, taille);
        transfere(T, T1, T2, taille, Tai);
        afficheTableau(T1, Tai[0]);
        afficheTableau(T2, Tai[1]);
    }
}
