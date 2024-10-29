

import java.util.Scanner;

public class Exercice3 {

    static Scanner sc = new Scanner(System.in);

    public static int saisiTaille() {
        int n = 0;
        do {
            System.out.println("Entrer la taille du tableau");
            n = sc.nextInt();
        } while (n <= 0);
        return n;

    }

    public static void saisiTableau(String[] T, int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrer la " + (i + 1) + "e chaine");
            T[i] = sc.next();
        }
    }

    public static void afficheTableau(String T[], int taille) {
        System.out.println("Affichage des elements du tableau");
        for (int i = 0; i < taille; i++) {
            System.out.print(T[i] + "\t");
        }
        System.out.println("");
    }

    public static void transfere(String T[], String T1[], int Tai[]) {
        Tai[0] = 0;
        for (String e : T) {
            if (e.toUpperCase().startsWith("P") && e.toUpperCase().endsWith("R")) {
                T1[Tai[0]] = e;
                Tai[0]++;
            }
        }
    }

    public static void main(String[] args) {
        int taille = saisiTaille();
        String[] T = new String[taille];
        
        int Tai[] = new int[1];
        String T1[] = new String[taille];
        saisiTableau(T, taille);
        afficheTableau(T, taille);
        transfere(T, T1, Tai);
        afficheTableau(T1, Tai[0]);
    }
}
