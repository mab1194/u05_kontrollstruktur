import java.util.*;

public class Ratentilgung2
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner (System.in);
      
      System.out.println("Bitte geben Sie eine ganzzahlige Kreditsumme ein");
      int kredit     = scanner.nextInt();
      
      System.out.println("Bitte geben Sie eine ganzzahligen Zinssatz ein");
      int zinssatz   = scanner.nextInt();
      System.out.println(zinssatz);
      
      System.out.println("Bitte geben Sie eine ganzzahlige Kreditlaufzeit in Jahren ein");
      int laufzeit   = scanner.nextInt();

      int tilgung = kredit / laufzeit;

      int zinsen;
   
      int zahlung;

      int restschuld = kredit;

      System.out.println("");
      System.out.println("Ratentilgung");
      System.out.println("");

      for(int i = 1; i<=laufzeit; i++)
      { 
         zinsen      =  restschuld * zinssatz / 100;
         zahlung     =  tilgung + zinsen;

         System.out.printf("Jahr %d " + "  Restschuld %4d " + "  Zinsen %3d " + "  Tilgung %4d " + "  Zahlung %4d ", i , restschuld, zinsen, tilgung, zahlung);
         System.out.println("");

         restschuld  =  restschuld - tilgung;
      } 
   }
}