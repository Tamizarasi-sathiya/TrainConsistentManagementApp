package test;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCode {

    static class GoodsBogie {

        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // Method to check safety
    boolean checkSafety(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );
    }

    @Test
    void testSafety_ValidPetroleumTransport() {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal")
        );

        assertTrue(checkSafety(bogies));
    }

    @Test
    void testSafety_InvalidCylindricalCargo() {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(checkSafety(bogies));
    }

    @Test
    void testSafety_MultipleValidBogies() {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Open", "Coal")
        );

        assertTrue(checkSafety(bogies));
    }

    @Test
    void testSafety_EmptyList() {

        List<GoodsBogie> bogies = new ArrayList<>();

        assertTrue(checkSafety(bogies));
    }

    @Test
    void testSafety_OriginalListUnchanged() {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Open", "Coal"));

        checkSafety(bogies);

        assertEquals(1, bogies.size());
    }
}