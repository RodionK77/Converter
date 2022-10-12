package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    Converter conv = new Converter();

    @Test
    void getValueTest() {
        assertEquals(106680.0, conv.getValue(41));
        assertEquals(71.12, conv.getValue(43));

    }

    @Test
    void convertTest() {
        assertEquals(2151.0955, conv.convert(42, 1008.2, 0.01));
        assertEquals(0.5874, conv.convert(44, 12, 0.011));
    }
}