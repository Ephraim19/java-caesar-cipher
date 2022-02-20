package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    @Test
    void Caesar_testsForstring_String() {
        Caesar myChar = new Caesar("a");
        assertEquals(true,myChar instanceof Caesar);
    }

    @Test
    void newCaesar_checksEncoding_t() {
        Caesar myCharArray = new Caesar("t");
        assertEquals("q",myCharArray.encodeLetters());
    }

    @Test
    void newCaesar_checksDecoding_t() {
        Caesar myCharArray = new Caesar("q");
        assertEquals("t",myCharArray.decodeLetters());
    }
}