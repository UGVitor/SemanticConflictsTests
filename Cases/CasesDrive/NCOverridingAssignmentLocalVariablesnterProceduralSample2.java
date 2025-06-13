package org.CasesDrive;

// Not Conflict
public class OverridingAssignmentLocalVariablesNotConflictInterProceduralSample2 {
    public void m() {
        int x = 0; // LEFT
        foo(x);     // RIGHT

    }

    private void foo(int a) {
        a = 3;
    }


}
