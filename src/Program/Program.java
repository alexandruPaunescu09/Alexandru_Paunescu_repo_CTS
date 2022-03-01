package Program;

import clase.Angajat;
import clase.AngajatiReader;
import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AngajatiReader angajatiReader = new AngajatiReader();
        try {
            listaAngajati = angajatiReader.citireAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
