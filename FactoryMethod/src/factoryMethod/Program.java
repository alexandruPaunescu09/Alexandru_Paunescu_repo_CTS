package factoryMethod;

public class Program {
    public static void main(String[] args) {
        mijlocDeTransport autobuz1 = new factoryAutobuz().getMijlocTransport(123456);
        System.out.println(autobuz1.toString());
    }
}
