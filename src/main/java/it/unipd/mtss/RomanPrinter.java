package it.unipd.mtss;

import java.util.Arrays;
import java.util.HashMap;

public class RomanPrinter {
    private static HashMap<Character, String[]> converter = null;
    static {
        HashMap<Character, String[]> Map = new HashMap<Character, String[]>();
        Map.put('I', new String[] { " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|" });
        Map.put('V', new String[] { "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    " });
        Map.put('X', new String[] { "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\" });
        Map.put('L', new String[] { " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|" });
        Map.put('C', new String[] { "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|" });
        Map.put('D', new String[] { " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ " });
        Map.put('M', new String[] { " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|" });
        converter = Map;
    }
    public static String print(int num)
    {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) throws IllegalArgumentException
    {
        if (romanNumber.equals("")) 
        {
            return "";
        }
        for (int c = 0; c < romanNumber.length(); c++) {
            char currCh = romanNumber.charAt(c);
            if (!(Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M').contains(currCh))) {
                throw new IllegalArgumentException("carattere non valido");
            }
        }
        StringBuilder ascii=new StringBuilder();
        //stampo le righe
        for (int i = 0; i < 6; i++) {
            for (int c = 0; c < romanNumber.length(); c++) {
                ascii.append(converter.get(romanNumber.charAt(c))[i]);
            }
            ascii.append('\n');
        }
        return ascii.toString();
    }
}