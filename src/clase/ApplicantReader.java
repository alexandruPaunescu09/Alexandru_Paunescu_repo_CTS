package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplicantReader {
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
