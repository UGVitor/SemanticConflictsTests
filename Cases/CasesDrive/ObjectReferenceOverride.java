package org.CasesDrive;

public class ObjectReferenceOverride {
    public static class User {
        String name;
        public User(String n) { name = n; }
    }

    public static void main(String[] args) {
        User u = new User("Alice");  // Base

        // LEFT: modifica o objeto existente
        u.name = "Bob";

        // RIGHT: cria nova instância
        u = new User("Carol");

        System.out.println("Nome final: " + u.name);
    }
}
