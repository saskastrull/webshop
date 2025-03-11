package org.example.business.products;

import org.example.constants.general.Color;
import org.example.constants.general.Material;
import org.example.constants.general.Size;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SkirtTest {

    private Skirt skirt;

    @BeforeEach
    public void setUp() {
        skirt = new Skirt();
        skirt.setColor(Color.BLACK);
        skirt.setMaterial(Material.COTTON);
        skirt.setSize(Size.MEDIUM);
    }

    @Test
    public void testDefaultPrice() {
        assertEquals(20, skirt.getPrice());
    }

    @Test
    public void testSetPrice() {
        skirt.setPrice(250);
        assertEquals(250, skirt.getPrice());
    }

    @Test
    public void testSetWaistline() {
        String waistline = "HIGH";
        skirt.setWaistline(waistline);
        assertEquals(waistline, skirt.getWaistline());
    }

    @Test
    public void testSetPattern() {
        String pattern = "STRIPED";
        skirt.setPattern(pattern);
        assertEquals(pattern, skirt.getPattern());
    }

    @Test
    public void testToString() {
        skirt.setWaistline("HIGH");
        skirt.setPattern("STRIPED");
        String expected = "null BLACK COTTON MEDIUM STRIPED HIGH " + skirt.getId();
        assertEquals(expected, skirt.toString());
    }

    @Test
    public void testSetName() {
        skirt.setName("SKIRT");
        assertEquals("SKIRT", skirt.getName());
    }

    @Test
    public void testGarmentInheritance() {
        assertTrue(skirt instanceof Garment);
    }
}
