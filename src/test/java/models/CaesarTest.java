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
    void newCaesar_checksEncoding_t() {
        Caesar myCharArray = new Caesar("t",3);
        assertEquals("q",myCharArray.encodeLetters());
    }

    @Test
    void newCaesar_checksDecoding_t() {
        Caesar myCharArray = new Caesar("q",3);
        assertEquals("t",myCharArray.decodeLetters());
    }
}