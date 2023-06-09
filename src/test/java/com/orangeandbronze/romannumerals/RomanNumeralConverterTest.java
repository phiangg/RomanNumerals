package com.orangeandbronze.romannumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConverterTest {
    @Test
    void intToRoman_1() {
        //Given argument of 1
        int num = 1;
        //When argument is passed into parameter of method
        String actual = new RomanNumeralConverter().intToRoman(num);
        //Then method should return "I"
        assertEquals("I", actual);
    }

    @Test
    void intToRoman_2() {
        assertEquals("II", new RomanNumeralConverter().intToRoman(2));
    }

    @Test
    void intToRoman_3() {
        assertEquals("III", new RomanNumeralConverter().intToRoman(3));
    }

    @Test
    void intToRoman_4() {
        assertEquals("IV", new RomanNumeralConverter().intToRoman(4));
    }

    @Test
    void intToRoman_5() {
        assertEquals("V", new RomanNumeralConverter().intToRoman(5));
    }

    @Test
    void intToRoman_24(){
        assertEquals("XXIV", new RomanNumeralConverter().intToRoman(24));
    }

    @Test
    void intToRoman_69(){
        assertEquals("LXIX", new RomanNumeralConverter().intToRoman(69));
    }

    @Test
    void intToRoman_500(){
        assertEquals("D", new RomanNumeralConverter().intToRoman(500));
    }

    @Test
    void intToRoman_1000(){
        assertEquals("M", new RomanNumeralConverter().intToRoman(1000));
    }
}
