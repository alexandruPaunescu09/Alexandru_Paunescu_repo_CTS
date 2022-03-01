package clase;

import java.util.Scanner;

public class AplicantReader {
    public static void citireAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] proiecte = new String[nr];
        for (int i = 0; i < nr; i++)
            proiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setNume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(nr, proiecte);
        for (int i=0;i<nr;i++) {
            aplicant.denumireProiect[i] = proiecte[i];
        }
    }
}
