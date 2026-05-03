package test;

import main.Main.CargoSafetyException;
import main.Main.GoodsBogie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");
        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentDoesNotAssignCargo() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        // because exception is caught inside method
        assertNull(b.cargo);
    }

    @Test
    void testCargo_ValidAssignmentAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        b.assignCargo("Petroleum"); // fails internally
        b.assignCargo("Coal");      // should succeed

        assertEquals("Coal", b.cargo);
    }

    @Test
    void testCargo_FinallyAlwaysExecutes() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Coal");

        assertEquals("Coal", b.cargo);
    }
}