package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplicantReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
