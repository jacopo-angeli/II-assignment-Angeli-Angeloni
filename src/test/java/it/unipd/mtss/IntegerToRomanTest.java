////////////////////////////////////////////////////////////////////
// [Alberto] [Angeloni] [1231122]
// [Jacopo] [Angeli] [1232583]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {
   @Test
   public void FirstThreeNumbers() {
      String uno = IntegerToRoman.convert(1);
      String due = IntegerToRoman.convert(2);
      String tre = IntegerToRoman.convert(3);
      String p = "I";
      String s = "II";
      String t = "III";
      assertEquals(p, uno);
      assertEquals(s, due);
      assertEquals(t, tre);
   }

   @Test
   public void FirstSixNumbers() {
      String quattro = IntegerToRoman.convert(4);
      String cinque = IntegerToRoman.convert(5);
      String sei = IntegerToRoman.convert(6);
      System.out.println(sei);
      String p = "IV";
      String s = "V";
      String t = "VI";
      assertEquals(p, quattro);
      assertEquals(s, cinque);
      assertEquals(t, sei);
   }

   @Test
   public void FirstTenNumbers() {
      String sette = IntegerToRoman.convert(7);
      String otto = IntegerToRoman.convert(8);
      String nove = IntegerToRoman.convert(9);
      String dieci = IntegerToRoman.convert(10);
      String p = "VII";
      String s = "VIII";
      String t = "IX";
      String x = "X";
      assertEquals(p, sette);
      assertEquals(s, otto);
      assertEquals(t, nove);
      assertEquals(x, dieci);
   }

   @Test
   public void First20Numbers() {
      String undici = IntegerToRoman.convert(11);
      String dodici = IntegerToRoman.convert(12);
      String tredici = IntegerToRoman.convert(13);
      String quattordici = IntegerToRoman.convert(14);
      String quindici = IntegerToRoman.convert(15);
      String sedici = IntegerToRoman.convert(16);
      String diciassette = IntegerToRoman.convert(17);
      String diciotto = IntegerToRoman.convert(18);
      String diciannove = IntegerToRoman.convert(19);
      String venti = IntegerToRoman.convert(20);
      String u = "XI";
      String d = "XII";
      String t = "XIII";
      String q = "XIV";
      String qq = "XV";
      String s = "XVI";
      String x = "XVII";
      String z = "XVIII";
      String m = "XIX";
      String v = "XX";
      assertEquals(u, undici);
      assertEquals(d, dodici);
      assertEquals(t, tredici);
      assertEquals(q, quattordici);
      assertEquals(qq, quindici);
      assertEquals(s, sedici);
      assertEquals(x, diciassette);
      assertEquals(z, diciotto);
      assertEquals(m, diciannove);
      assertEquals(v, venti);
   }

   // per questioni di onerosità da questo test iniziamo a testare dei valori
   // campione e non tutto l'intervallo
   @Test
   public void First50Numbers() {
      String vtre = IntegerToRoman.convert(23);
      String tuno = IntegerToRoman.convert(31);
      String totto = IntegerToRoman.convert(38);
      String quno = IntegerToRoman.convert(41);
      String qsei = IntegerToRoman.convert(46);
      String qnove = IntegerToRoman.convert(49);
      String cinquanta = IntegerToRoman.convert(50);
      String vcinque = IntegerToRoman.convert(25);
      String vnove = IntegerToRoman.convert(29);
      String ttre = IntegerToRoman.convert(33);
      String a = "XXIII";
      String b = "XXXI";
      String c = "XXXVIII";
      String d = "XLI";
      String e = "XLVI";
      String f = "XLIX";
      String g = "L";
      String h = "XXV";
      String i = "XXIX";
      String l = "XXXIII";
      assertEquals(a, vtre);
      assertEquals(b, tuno);
      assertEquals(c, totto);
      assertEquals(d, quno);
      assertEquals(e, qsei);
      assertEquals(f, qnove);
      assertEquals(g, cinquanta);
      assertEquals(h, vcinque);
      assertEquals(i, vnove);
      assertEquals(l, ttre);
   }

   @Test
   public void First100Numbers() {
      String ccinque = IntegerToRoman.convert(55);
      String stre = IntegerToRoman.convert(63);
      String setd = IntegerToRoman.convert(72);
      String ouno = IntegerToRoman.convert(81);
      String nov = IntegerToRoman.convert(90);
      String ncinque = IntegerToRoman.convert(95);
      String cento = IntegerToRoman.convert(100);
      String cnove = IntegerToRoman.convert(59);
      String sotto = IntegerToRoman.convert(68);
      String ssei = IntegerToRoman.convert(76);
      String a = "LV";
      String b = "LXIII";
      String c = "LXXII";
      String d = "LXXXI";
      String e = "XC";
      String f = "XCV";
      String g = "C";
      String h = "LIX";
      String i = "LXVIII";
      String l = "LXXVI";
      assertEquals(a, ccinque);
      assertEquals(b, stre);
      assertEquals(c, setd);
      assertEquals(d, ouno);
      assertEquals(e, nov);
      assertEquals(f, ncinque);
      assertEquals(g, cento);
      assertEquals(h, cnove);
      assertEquals(i, sotto);
      assertEquals(l, ssei);
   }

   @Test
   public void First500Numbers() {
      String dtre = IntegerToRoman.convert(123);
      String onove = IntegerToRoman.convert(189);
      String scinque = IntegerToRoman.convert(275);
      String usette = IntegerToRoman.convert(317);
      String venti = IntegerToRoman.convert(420);
      String cdue = IntegerToRoman.convert(452);
      String cinquecento = IntegerToRoman.convert(500);
      String qtre = IntegerToRoman.convert(143);
      String zcinque = IntegerToRoman.convert(205);
      String tonove = IntegerToRoman.convert(389);
      String a = "CXXIII";
      String b = "CLXXXIX";
      String c = "CCLXXV";
      String d = "CCCXVII";
      String e = "CDXX";
      String f = "CDLII";
      String g = "D";
      String h = "CXLIII";
      String i = "CCV";
      String l = "CCCLXXXIX";
      assertEquals(a, dtre);
      assertEquals(b, onove);
      assertEquals(c, scinque);
      assertEquals(d, usette);
      assertEquals(e, venti);
      assertEquals(f, cdue);
      assertEquals(g, cinquecento);
      assertEquals(h, qtre);
      assertEquals(i, zcinque);
      assertEquals(l, tonove);
   }

   @Test
   public void First1000Numbers() {
      String tquattro = IntegerToRoman.convert(534);
      String udue = IntegerToRoman.convert(612);
      String ctre = IntegerToRoman.convert(753);
      String notto = IntegerToRoman.convert(898);
      String tdue = IntegerToRoman.convert(932);
      String scinque = IntegerToRoman.convert(965);
      String mille = IntegerToRoman.convert(1000);
      String qtre = IntegerToRoman.convert(543);
      String onove = IntegerToRoman.convert(689);
      String odue = IntegerToRoman.convert(782);
      String a = "DXXXIV";
      String b = "DCXII";
      String c = "DCCLIII";
      String d = "DCCCXCVIII";
      String e = "CMXXXII";
      String f = "CMLXV";
      String g = "M";
      String h = "DXLIII";
      String i = "DCLXXXIX";
      String l = "DCCLXXXII";
      assertEquals(a, tquattro);
      assertEquals(b, udue);
      assertEquals(c, ctre);
      assertEquals(d, notto);
      assertEquals(e, tdue);
      assertEquals(f, scinque);
      assertEquals(g, mille);
      assertEquals(h, qtre);
      assertEquals(i, onove);
      assertEquals(l, odue);
   }
}