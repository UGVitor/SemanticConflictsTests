package org.CasesDrive;

import java.util.*;

public class ListReferenceOverride {
    public static void main(String[] args) {
        // Base
        List<String> list = new ArrayList<>();
        list.add("A");

        // LEFT: acrescenta na lista original
        list.add("B");

        // RIGHT: muda referência para outra lista
        list = Arrays.asList("X", "Y");

        System.out.println("Conteúdo: " + list);
    }
}
