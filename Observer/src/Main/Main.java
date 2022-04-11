package Main;

import clase.Autobuz;
import clase.Calator;
import clase.Icalator;
import clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz(168);
        Icalator c1 = new Calator("Popescu");
        Icalator c2 = new Calator("Marcel");
        Icalator c3 = new Calator("Dorel");

        autobuz.adaugaCalator(c1);
        autobuz.adaugaCalator(c2);

        autobuz.anuntaCalator();

        System.out.println("In urma modificarilor:");

        autobuz.eliminaCalator(c2);
        autobuz.adaugaCalator(c3);

        autobuz.anuntaCalator();
    }
}
