package Program;

import clase.Angajat;
import clase.AngajatiReader;
import clase.Aplicant;
import clase.ApplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        ApplicantReader angajatiReader = new AngajatiReader();
        try {
            listaAngajati = angajatiReader.citireAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati){
                angajat.afiseazaSalariuZilnic(1000);
                angajat.afiseazaStatut();
                System.out.println(angajat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
