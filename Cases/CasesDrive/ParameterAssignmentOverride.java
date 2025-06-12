package org.CasesDrive;

public class ParameterAssignmentOverride {
    public static void process(int[] data) {
        // Base
        int x = data[0] + 1;
        System.out.println("Base x: " + x);

        // LEFT
        data[0] = 5;

        // RIGHT
        data[0] = 8;

        System.out.println("Final data[0]: " + data[0]);
    }
}
