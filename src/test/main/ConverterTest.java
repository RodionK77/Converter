package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    Converter conv = new Converter();

    @Test
    void getValueTest() {
        assertEquals(106680.0, conv.getValue(41));
        assertEquals(71.12, conv.getValue(43));
        assertEquals(30.5, conv.getValue(52));
        assertEquals(160000.0, conv.getValue(54));
        assertEquals(1.0, conv.getValue(1));
        assertEquals(100.0, conv.getValue(2));
        assertEquals(100000.0, conv.getValue(3));

    }

    @Test
    void convertTest() {
        assertEquals(2151.0955, conv.convert(42, 1008.2, 0.01));
        assertEquals(0.5874, conv.convert(44, 12, 0.011));
        assertEquals(0.0018, conv.convert(51, 75, 0.0000094));
        assertEquals(0.2989, conv.convert(53, 332.098, 0.00001));
        assertEquals(0.168, conv.convert(1, 12, 0.014));
        assertEquals(257.4, conv.convert(2, 78, 0.033));
        assertEquals(214.6866, conv.convert(2, 456.78, 0.0047));
        assertEquals(400000.0, conv.convert(3, 4, 1.0));
    }
}