package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements ApplicantReader{

    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a1 = new Angajat();
            AplicantReader.citireAplicant(input2, a1);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            a1.setSalariu(salariu);
            a1.setOcupatie(ocupatie);
            angajati.add(a1);
        }
        input2.close();
        return angajati;
    }
}
