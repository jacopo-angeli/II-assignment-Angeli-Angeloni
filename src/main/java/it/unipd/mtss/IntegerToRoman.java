////////////////////////////////////////////////////////////////////
// [Alberto] [Angeloni] [1231122]
// [Jacopo] [Angeli] [1232583]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) throws IllegalArgumentException {
        if (number < 0 || number > 1000) {
            throw new IllegalArgumentException("Input not in range [0-1000].");
        }
        String[] i = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] x = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] c = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        int I = number % 10;
        number = number / 10;
        int X = number % 10;
        number = number / 10;
        int C = number % 10;
        number = number / 10;
        return "M".repeat(number) + c[C] + x[X] + i[I];
    }
}
