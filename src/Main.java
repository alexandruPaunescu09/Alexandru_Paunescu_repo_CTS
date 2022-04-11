import FlyweightFactory.FlyweightFactory;
import clase.Autobuz;
import clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2000,50);
        Autobuz autobuz2 = new Autobuz("Dacia",2002,22);
        Autobuz autobuz3 = new Autobuz("A1",2020,53);
        Autobuz autobuz4 = new Autobuz("A4",2022,53);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(133);

        autobuz1.descriereAutobuz(linie1);
        autobuz2.descriereAutobuz(linie1);
        autobuz3.descriereAutobuz(linie2);
        autobuz4.descriereAutobuz(linie2);

    }
}
