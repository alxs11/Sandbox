package org.example.generics;

public class Driver {

    public static void main(String[] args) {

        Box<Integer> intValueBox = new Box(1);
        Box<Double> doubleValueBox = new Box(2);
        Box<Float> floatValueBox = new Box(3.0f);

        System.out.println(intValueBox);
        System.out.println(doubleValueBox);
        System.out.println(floatValueBox);
    }
}

        // List<Integer> stuff = new ArrayList<>();

        //stuff.add(1);
        //stuff.add(1.0f);
