
import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        double pu,TVA = 0.18, mHT,mTT;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prix unitaire : ");
         pu = scanner.nextDouble();

        System.out.print("Entrez la quantité : ");
        int qte = scanner.nextInt();


        mHT = pu * qte;
        mTT =mHT*(1+TVA);
        System.out.println("Le montant hors taxe est "+mHT);
        System.out.println("Le montant hors taxe est "+mTT);
    }
}
