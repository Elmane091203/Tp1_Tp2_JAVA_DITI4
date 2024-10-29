
import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {
        int choix, a, b;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1-Somme");
            System.out.println("2-Produit");
            System.out.println("3-Division");
            System.out.println("4-Modulo");
            System.out.println("5-Quitter");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    do {
                        System.out.println("Entrer la premiere valeur");
                        a = scanner.nextInt();
                    } while (a <= 0);
                    do {
                        System.out.println("Entrer la deuxieme valeur");
                        b = scanner.nextInt();
                    } while (b <= 0);
                    System.out.println("La somme est " + (a + b));
                    break;
                case 2:
                    do {
                        System.out.println("Entrer la premiere valeur");
                        a = scanner.nextInt();
                    } while (a <= 0);
                    do {
                        System.out.println("Entrer la deuxieme valeur");
                        b = scanner.nextInt();
                    } while (b <= 0);
                    System.out.println("Le produit est " + (a * b));
                    break;
                case 3:
                    do {
                        System.out.println("Entrer la premiere valeur");
                        a = scanner.nextInt();
                    } while (a <= 0);
                    do {
                        System.out.println("Entrer la deuxieme valeur");
                        b = scanner.nextInt();
                    } while (b <= 0);
                    System.out.println("La division est " + (a / b));
                    break;
                case 4:
                    do {
                        System.out.println("Entrer la premiere valeur");
                        a = scanner.nextInt();
                    } while (a <= 0);
                    do {
                        System.out.println("Entrer la deuxieme valeur");
                        b = scanner.nextInt();
                    } while (b <= 0);
                    System.out.println("Le modulo est " + (a % b));
                    break;
                default:
                    break;
            }
            if (choix==5) {
                System.out.println("Au revoir");
                break;
            }
        }
    }
}
