package main;

import clase.Autobuz;
import clase.AutobuzBuiler;

public class Main {
    public static void main(String[] args) {
        AutobuzBuiler builder = new AutobuzBuiler();
        builder.setTextRulat("La multi ani").setOraIncepereProgram(8);

        Autobuz a1 = builder.build();

        builder.setTextRulat("Romania").setOraIncepereProgram(2);
        Autobuz a2 = builder.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
