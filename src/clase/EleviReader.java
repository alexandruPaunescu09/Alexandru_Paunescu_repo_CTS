package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements ApplicantReader{
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            AplicantReader.citireAplicant(input2,e);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
