package factory;

public class Program {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        mijlocDeTransport autobuz = fabrica.getMijlocDeTransport(tipTransport.AUTOBUZ,1234567);
        mijlocDeTransport troleibuz = fabrica.getMijlocDeTransport(tipTransport.TROLEIBUZ,7654321);
        mijlocDeTransport tramvai = fabrica.getMijlocDeTransport(tipTransport.TRAMVAI,555555);

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
