package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements ApplicantReader{

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati =citireAplicatiDinScanner(scanner);
        scanner.close();
        return angajati;
    }

    private List<Aplicant> citireAplicatiDinScanner(Scanner scanner){
       List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            AplicantReader.citireAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        return angajati;
    }
}
