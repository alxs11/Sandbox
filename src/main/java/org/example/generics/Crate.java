package org.example.generics;

public class Crate {

    public <T> T clone(T t) {
        System.out.println(t.getClass().getName());
        return t;
    }

    public static void main(String[] args) {

        Crate crate = new Crate();
        crate.clone("Hello Generics");
        crate.clone(1);
    }
}




