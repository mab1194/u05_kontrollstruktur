import java.util.*;

public class Annuitaetentilgung1
{
   public static void main(String[] args)
   {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Geben Sie eine ganzzahlige Kreditsumme ein");
      int kredit = scanner.nextInt();
      
      System.out.println("Geben Sie einen ganzzahligen Zinssatz ein");
      int zinssatz = scanner.nextInt();
      
      System.out.println("Geben Sie Ihren gewünschten ganzzahligen Zahlungsbetrag ein");
      int annuitaet = scanner.nextInt();

      scanner.close();

      int restschuld = kredit;
      int zinsen;
      int tilgung;
      int zahlung;

      int i = 0;

      System.out.println("");
      System.out.println("Annuitaetentilgung");
      System.out.println("");
      System.out.printf("Zinssatz:  %4d\n",zinssatz);
      System.out.printf("Kredit:    %4d\n",kredit);
      System.out.printf("Annuitaet: %4d\n",annuitaet);
      System.out.println("");

      while(restschuld>0)
      {
         
         i++;
         
         zinsen   = restschuld * zinssatz / 100;
         tilgung  = annuitaet - zinsen;

         if(annuitaet>restschuld)
         {
            zahlung = restschuld + zinsen; 
         }
         else
         {
            zahlung  = annuitaet;
         }

         if(i==50)
         {
            break;         
         }

         System.out.printf("Jahr %d " + "  Restschuld %4d " + "  Zinsen %3d " + "  Tilgung %4d " + "  Zahlung %4d \n" , i, restschuld, zinsen, tilgung, zahlung);
         restschuld = restschuld - tilgung;
      }
   }
}