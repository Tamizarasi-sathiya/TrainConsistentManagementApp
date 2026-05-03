package test;

import main.Main.InvalidCapacityException;
import main.Main.PassengerBogie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @Test
    void testValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie("Sleeper", 50);
        assertEquals("Sleeper", b.type);
        assertEquals(50, b.capacity);
    }

    @Test
    void testInvalidCapacityThrowsException() {
        Exception exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", 0);
        });

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testNegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("First Class", -10);
        });
    }
}