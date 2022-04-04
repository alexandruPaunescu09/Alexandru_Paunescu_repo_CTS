package main;

import clase.Autobuz;
import clase.AutobuzBuiler;

public class Program {
    public static void main(String[] args) {
        AutobuzBuiler autobuzBuiler = new AutobuzBuiler();
        autobuzBuiler.setNumeSofer("Marcel").setNrLinie(12).setDeschideUsile(false);
        Autobuz autobuz = autobuzBuiler.build();

        Autobuz autobuz1 =new AutobuzBuiler().setNumeSofer("Bobita").setNrLinie(32).build();

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());

        AutobuzBuiler builer = new AutobuzBuiler();
        builer.setTextRulat("La multi ani").setOraIncepereProgram(9);

        Autobuz a1 = builer.build();

    }
}
