package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements ApplicantReader{
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(", ");
        List<Aplicant> elevi = citireAplicatiDinScanner(scanner);
        scanner.close();
        return elevi;
    }
    private List<Aplicant> citireAplicatiDinScanner(Scanner scanner){
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev e = new Elev();
            AplicantReader.citireAplicant(scanner,e);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }
        return elevi;
    }

}
