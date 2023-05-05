package com.orangeandbronze.romannumerals;

class RomanNumeralConverter {

    //int to roman string

    //method signature
    String intToRoman(int num) {

        StringBuilder builder = new StringBuilder();

        // Define arrays for Roman numeral symbols and their corresponding values
        String[] romnum_symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // Loop through the symbols and values arrays
        for (int i = 0; i < romnum_symbols.length; i++) {
            while (num >= values[i]) {
                builder.append(romnum_symbols[i]);
                num -= values[i];
            }
        }
        return builder.toString();
    }
}


/*if(num == 2){
            return "II";
        }else {
            return "I";
        }*/

//return num == 2 ? "II" : "I";
//---------

   /* StringBuilder builder = new StringBuilder();
        for (int i = 0; i < num; i++) {
        builder.append("I");
        }
        return builder.toString();*/
