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
    public void TestPrintL()
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
    public void TestPrintC()
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
    public void TestPrintD()
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
    public void TestPrintM()
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
    public void TestZero()
    {
        int n=0;
        String zero="";

        String ascii=RomanPrinter.print(n);

        assertEquals(zero, ascii);
    }
    @Test
    public void TestL511()
    {
        int n=511;
        String cunouno=new String(" _____  " + "__   __" + " _____ \n" +
                "|  __ \\ " + "\\ \\ / /" + "|_   _|\n"
                + "| |  | |" + " \\ V / " + "  | |  \n" +
                "| |  | |" + "  > <  " + "  | |  \n" +
                "| |__| |" + " / . \\ " + " _| |_ \n" +
                "|_____/ " + "/_/ \\_\\"
                + "|_____|\n");

        String ascii=RomanPrinter.print(n);

        assertEquals(cunouno, ascii);
    }

    @Test
    public void TestL56()
    {
        int n=65;
        String scinque=new String(" _      " + "__   __" + "__      __\n" +
                "| |     " + "\\ \\ / /" + "\\ \\    / /\n" +
                "| |     " + " \\ V / " + " \\ \\  / / \n" +
                "| |     " + "  > <  " + "  \\ \\/ /  \n" +
                "| |____ " + " / . \\ " + "   \\  /   \n" +
                "|______|" + "/_/ \\_\\" + "    \\/    \n");

        String ascii=RomanPrinter.print(n);

        assertEquals(scinque, ascii);
    }

}
