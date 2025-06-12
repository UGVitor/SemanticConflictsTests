package org.CasesDrive;



public class StaticFieldOverride {

    // Base
    public static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static void applyLeft() {
        // LEFT
        counter = 100;
    }

    public static void applyRight() {
        // RIGHT
        counter = 200;
    }

    public static void main(String[] args) {
        increment();
        applyLeft();
        applyRight();
        System.out.println("Counter final: " + counter);
    }
}
