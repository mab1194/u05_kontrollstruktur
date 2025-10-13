import java.util.*;

public class BreakEvenPoint
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
   
      System.out.println("Bitte einen ganzahligen Wert für den Verkaufspreis pro Stueck eingeben");
      int stueckVerkaufspreis = scanner.nextInt();

      System.out.println("Bitte einen ganzahligen Wert für die Rohstoffkosten pro Stueck eingeben");
      int stueckRohstoffkosten = scanner.nextInt();

      System.out.println("Bitte einen ganzahligen Wert für die Arbeitskosten pro Stueck eingeben");
      int stueckArbeitskosten = scanner.nextInt();

      System.out.println("Bitte einen ganzahligen Wert für die monatlichen Fixkosten pro Stueck eingeben");
      int monatFixkosten = scanner.nextInt();

      System.out.println("Bitte einen ganzahligen Wert für die maximale Stueckzahl pro Monat eingeben");
      int monatMaxStueckzahl = scanner.nextInt();

      int varKosten;
      int erloes;
      int ueberschuss;
      int gesamtkosten;
   
      System.out.println("");
      System.out.println("Break-EvenPoint");
      System.out.println("===============");
      System.out.println("Verkaufspreis pro Stueck: " + stueckVerkaufspreis);
      System.out.println("Rohstoffkosten pro Stueck: " + stueckRohstoffkosten);
      System.out.println("Arbeitskosten pro Stueck: " + stueckArbeitskosten);
      System.out.println("Fixkosten pro Monat: " + monatFixkosten);
      System.out.println("Maximale Stueckzahl pro Monat: " + monatMaxStueckzahl);
      System.out.println("");

      for(int i = 1; i<= monatMaxStueckzahl; i++)
      {
         varKosten = (stueckRohstoffkosten + stueckArbeitskosten) * i;
         
         gesamtkosten = varKosten + monatFixkosten;

         erloes    = stueckVerkaufspreis * i;
         
         ueberschuss = erloes - gesamtkosten;

         System.out.println("Stueckzahl: " + i + "  Gesamtkosten: " + gesamtkosten + "  Erloes: " + erloes + "  Ueberschuss: " + ueberschuss);      
      }
   }
}