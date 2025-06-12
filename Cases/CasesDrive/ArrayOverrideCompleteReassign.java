package org.CasesDrive;

public class ArrayOverrideCompleteReassign {
    public static void main(String[] args) {
        // Base
        int[] data = {1, 2, 3};

        // LEFT: modifica elemento
        data[2] = 9;

        // RIGHT: substitui toda a referência
        data = new int[]{4, 5, 6};

        System.out.print("Data final: ");
        for (int n : data) {
            System.out.print(n + " ");
        }
    }
}
