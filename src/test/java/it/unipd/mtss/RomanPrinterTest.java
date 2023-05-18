package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.BeforeClass;

public class RomanPrinterTest {
    //static RomanPrinter printer;
    //@BeforeClass
    //public static void initializePrinter() {
    //    printer = new RomanPrinter();
    //}
    @Test
    public void TestPrintI()
    {
        int n=1;
        String I=new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n");

        String ascii = RomanPrinter.print(n);

        assertEquals(I, ascii);
    }
    @Test
    public void TestPrintV()
    {
        int n=5;
        String V=new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n");

        String ascii=RomanPrinter.print(n);

        assertEquals(V, ascii);
    }
    @Test
    public void testPrintL()
    {
        int n=50;
        String L=new String(" _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n");

        String ascii=RomanPrinter.print(n);

        assertEquals(L, ascii);
    }
    @Test
    public void testPrintC()
    {
        int n=100;
        String C=new String("  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n");

        String ascii= RomanPrinter.print(n);

        assertEquals(C, ascii);
    }
    @Test
    public void testPrintD()
    {
        int n=500;
        String D=new String(" _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n");

        String ascii= RomanPrinter.print(n);

        assertEquals(D, ascii);
    }

    @Test
    public void testPrintM()
    {
        int n=1000;
        String M = new String(" __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n");

        String ascii=RomanPrinter.print(n);

        assertEquals(M, ascii);
    }
    @Test
    public void testNumberZeroAsciiArt()
    {
        int n=0;
        String zero="";

        String ascii=RomanPrinter.print(n);

        assertEquals(zero, ascii);
    }
    @Test
    public void testLettersCombination1666()
    {
        int n=1666;
        String exp=new String(
                " __  __ " + " _____  " + "  _____ " + " _      " + "__   __" + "__      __" + " _____ \n" +
                        "|  \\/  |" + "|  __ \\ " + " / ____|" + "| |     " + "\\ \\ / /" + "\\ \\    / /" + "|_   _|\n"
                        +
                        "| \\  / |" + "| |  | |" + "| |     " + "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  \n" +
                        "| |\\/| |" + "| |  | |" + "| |     " + "| |     " + "  > <  " + "  \\ \\/ /  " + "  | |  \n" +
                        "| |  | |" + "| |__| |" + "| |____ " + "| |____ " + " / . \\ " + "   \\  /   " + " _| |_ \n" +
                        "|_|  |_|" + "|_____/ " + " \\_____|" + "|______|" + "/_/ \\_\\" + "    \\/    "
                        + "|_____|\n");

        String ascii=RomanPrinter.print(n);

        assertEquals(exp, ascii);
    }

}
