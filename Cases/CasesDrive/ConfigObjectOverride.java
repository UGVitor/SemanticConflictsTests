package org.CasesDrive;



public class ConfigObjectOverride {
    public static class Options {
        public String mode = "DEFAULT";
    }

    // Base
    public static Options opts = new Options();

    public static void applyLeft() {
        // LEFT
        opts.mode = "SAFE";
    }

    public static void applyRight() {
        // RIGHT
        opts = new Options();
        opts.mode = "FAST";
    }

    public static void main(String[] args) {
        applyLeft();
        applyRight();
        System.out.println("Options.mode: " + opts.mode);
    }
}
