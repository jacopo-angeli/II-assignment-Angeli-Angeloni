////////////////////////////////////////////////////////////////////
// [Alberto] [Angeloni] [1231122]
// [Jacopo] [Angeli] [1232583]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest
{
   @Test
   public void TestFirstThreeNumbers()
   {
      String uno=IntegerToRoman.convert(1);
      String due=IntegerToRoman.convert(2);
      String tre=IntegerToRoman.convert(3);
      String p="I";
      String s="II";
      String t="III";
      assertSame(p, uno);
      assertSame(s, due);
      assertSame(t, tre);
   }
   @Test
   public void TestFirstSixNumbers()
   {
      String quattro=IntegerToRoman.convert(4);
      String cinque=IntegerToRoman.convert(5);
      String sei=IntegerToRoman.convert(6);
      String p="IV";
      String s="V";
      String t="VI";
      assertSame(p, quattro);
      assertSame(s, cinque);
      assertSame(t, sei);
   }
    @Test
    public void TestFirstTenNumbers()
    {
      String sette=IntegerToRoman.convert(7);
      String otto=IntegerToRoman.convert(8);
      String nove=IntegerToRoman.convert(9);
      String dieci=IntegerToRoman.convert(10);
      String p="VII";
      String s="VIII";
      String t="IX";
      String x="X";
      assertSame(p, sette);
      assertSame(s, otto);
      assertSame(t, nove);
      assertSame(x, dieci);
    }
    @Test
    public void TestFirst20Numbers()
    {
      String undici=IntegerToRoman.convert(11);
      String dodici=IntegerToRoman.convert(12);
      String tredici=IntegerToRoman.convert(13);
      String quattordici=IntegerToRoman.convert(14);
      String quindici=IntegerToRoman.convert(15);
      String sedici=IntegerToRoman.convert(16);
      String diciassette=IntegerToRoman.convert(17);
      String diciotto=IntegerToRoman.convert(18);
      String diciannove=IntegerToRoman.convert(19);
      String venti=IntegerToRoman.convert(20);
      String u="XI";
      String d="XII";
      String t="XIII";
      String q="XIV";
      String qq="XV";
      String s="XVI";
      String x="XVII";
      String z="XVIII";
      String m="XIX";
      String v="XX";
      assertSame(u, undici);
      assertSame(d, dodici);
      assertSame(t, tredici);
      assertSame(q, quattordici);
      assertSame(qq, quindici);
      assertSame(s, sedici);
      assertSame(x, diciassette);
      assertSame(z, diciotto);
      assertSame(m, diciannove);
      assertSame(v, venti);
    }
    // per questioni di onerosità da questo test iniziamo a testare dei valori campione e non tutto l'intervallo
    @Test
    public void TestFirst50Numbers()
    {
      String vtre=IntegerToRoman.convert(23);
      String tuno=IntegerToRoman.convert(31);
      String totto=IntegerToRoman.convert(38);
      String quno=IntegerToRoman.convert(41);
      String qsei=IntegerToRoman.convert(46);
      String qnove=IntegerToRoman.convert(49);
      String cinquanta=IntegerToRoman.convert(50);
      String vcinque=IntegerToRoman.convert(25);
      String vnove=IntegerToRoman.convert(29);
      String ttre=IntegerToRoman.convert(33);
      String a="XXIII";
      String b="XXXI";
      String c="XXXVIII";
      String d="XLI";
      String e="XLVI";
      String f="XLIX";
      String g="L";
      String h="XXV";
      String i="XXIX";
      String l="XXXIII";
      assertSame(a, vtre);
      assertSame(b, tuno);
      assertSame(c, totto);
      assertSame(d, quno);
      assertSame(e, qsei);
      assertSame(f, qnove);
      assertSame(g, cinquanta);
      assertSame(h, vcinque);
      assertSame(i, vnove);
      assertSame(l, ttre);
    }
    @Test
    public void TestFirst100Numbers()
    {
      String ccinque=IntegerToRoman.convert(55);
      String stre=IntegerToRoman.convert(63);
      String setd=IntegerToRoman.convert(72);
      String ouno=IntegerToRoman.convert(81);
      String nov=IntegerToRoman.convert(90);
      String ncinque=IntegerToRoman.convert(95);
      String cento=IntegerToRoman.convert(100);
      String cnove=IntegerToRoman.convert(59);
      String sotto=IntegerToRoman.convert(68);
      String ssei=IntegerToRoman.convert(76);
      String a="LV";
      String b="LXIII";
      String c="LXXII";
      String d="LXXXI";
      String e="XC";
      String f="XCV";
      String g="C";
      String h="LIX";
      String i="LXVIII";
      String l="LXXVI";
      assertSame(a, ccinque);
      assertSame(b, stre);
      assertSame(c, setd);
      assertSame(d, ouno);
      assertSame(e, nov);
      assertSame(f, ncinque);
      assertSame(g, cento);
      assertSame(h, cnove);
      assertSame(i, sotto);
      assertSame(l, ssei);
    }
   @Test
   public void TestFirst500Numbers()
   {
      String dtre=IntegerToRoman.convert(123);
      String onove=IntegerToRoman.convert(189);
      String scinque=IntegerToRoman.convert(275);
      String usette=IntegerToRoman.convert(317);
      String venti=IntegerToRoman.convert(420);
      String cdue=IntegerToRoman.convert(452);
      String cinquecento=IntegerToRoman.convert(500);
      String qtre=IntegerToRoman.convert(143);
      String zcinque=IntegerToRoman.convert(205);
      String tonove=IntegerToRoman.convert(389);
      String a="CXXIII";
      String b="CLXXXIX";
      String c="CCLXXV";
      String d="CCCXVII";
      String e="CDXX";
      String f="CDLII";
      String g="D";
      String h="CXLIII";
      String i="CCV";
      String l="CCCLXXXIX";
      assertSame(a, dtre);
      assertSame(b, onove);
      assertSame(c, scinque);
      assertSame(d, usette);
      assertSame(e, venti);
      assertSame(f, cdue);
      assertSame(g, cinquecento);
      assertSame(h, qtre);
      assertSame(i, zcinque);
      assertSame(l, tonove);
   }
   @Test
   public void TestFirst1000Numbers()
   {
      String tquattro=IntegerToRoman.convert(534);
      String udue=IntegerToRoman.convert(612);
      String ctre=IntegerToRoman.convert(753);
      String notto=IntegerToRoman.convert(898);
      String tdue=IntegerToRoman.convert(932);
      String scinque=IntegerToRoman.convert(965);
      String mille=IntegerToRoman.convert(1000);
      String qtre=IntegerToRoman.convert(543);
      String onove=IntegerToRoman.convert(689);
      String odue=IntegerToRoman.convert(782);
      String a="DXXXIV";
      String b="DCXII";
      String c="DCCLIII";
      String d="DCCCXCVIII";
      String e="CMXXXII";
      String f="CMLXV";
      String g="M";
      String h="DXLIII";
      String i="DCLXXXIX";
      String l=" DCCLXXXII";
      assertSame(a, tquattro);
      assertSame(b, udue);
      assertSame(c, ctre);
      assertSame(d, notto);
      assertSame(e, tdue);
      assertSame(f, scinque);
      assertSame(g, mille);
      assertSame(h, qtre);
      assertSame(i, onove);
      assertSame(l, odue);
   }
}