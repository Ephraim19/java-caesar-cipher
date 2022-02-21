package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    @Test
    void Caesar_testsForstring_String() {
        Caesar myChar = new Caesar("a",2);
        assertEquals(true,myChar instanceof Caesar);
    }

    @Test
    void newCaesar_checksDecoding_returnsT() {
        Caesar myCharArray = new Caesar("q",23);
        assertEquals("t",myCharArray.decodeLetters());
    }

    @Test
    void newCaesar_checksEncoding_returnsQ() {
        Caesar myCharArray = new Caesar("t",23);
        assertEquals("q",myCharArray.encodeLetters());
    }
}