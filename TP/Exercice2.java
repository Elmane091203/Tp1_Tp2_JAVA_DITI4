
import java.util.Scanner;

public class Exercice2 {

    static Scanner sc = new Scanner(System.in);

    public static int saisiTaille() {
        int n;
        do {
            System.out.println("Entrer la taille du tableau");
            n = sc.nextInt();
        } while (n <= 0);
        return n;

    }

    public static int verifDoublon(int T[], int taille) {
        int verif = 0;
        for (int i = 0; i <= taille; i++) {
            for (int j = 0; j < i; j++) {
                if (T[i] == T[j]) {
                    verif = 1;
                    break;
                }
            }
            if (verif == 1) {
                return verif;
            }
        }
        return verif;
    }

    public static void saisiTableauSD(int T[], int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.println("Entrer un nombre");
            T[i] = sc.nextInt();
            int verif = verifDoublon(T, i);
            while (verif == 1) {
                System.out.println("Deja saisi! resaisissez!");
                T[i] = sc.nextInt();
                verif = verifDoublon(T, i);
            }
        }
    }

    public static void afficheTableau(int T[], int taille) {
        System.out.println("Affichage des elements du tableau");
        for (int i = 0; i < taille; i++) {
            System.out.print(T[i] + "\t");
        }
        System.out.println("");
    }

    public static boolean carreParfait(int nombre) {
        for (int i = 1; i <= nombre / 2; i++) {
            if (i * i == nombre) {
                return true;
            }
        }
        return false;
    }

    public static boolean nombrePremier(int nombre) {
        int cpt = 0;
        for (int i = 2; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                cpt++;
            }
        }
        return (cpt==0);
    }
    public static void transfere(int T[], int T1[], int T2[], int taille, int Tai[]) {
        Tai[0]=0;
        Tai[1]=0;
        for (int i = 0; i < taille; i++) {
            if (nombrePremier(T[i])) {
                T1[Tai[0]] = T[i];
                Tai[0]++;
            }
            if (carreParfait(T[i])) {
                    T2[Tai[1]] = T[i];
                    Tai[1]++;
            }
        }
    }

    public static void main(String[] args) {
        int taille = saisiTaille();
        int T[] = new int[taille];
        int Tai[] = new int[2];
        int T1[] = new int[taille];
        int T2[] = new int[taille];
        saisiTableauSD(T, taille);
        afficheTableau(T, taille);
        transfere(T, T1, T2, taille, Tai);
        afficheTableau(T1, Tai[0]);
        afficheTableau(T2, Tai[1]);
    }

}
