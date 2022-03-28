package singleton.Main;

import singleton.Repartitor;

public class Main {
    public static void main(String[] args) {
        Repartitor r1 = Repartitor.getInstance();
        Repartitor r2 = Repartitor.getInstance();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
