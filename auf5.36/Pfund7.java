import java.util.*;

public class Pfund7
{
   public static void main(String[]args)
   {  
      Scanner scanner = new Scanner(System.in);
      System.out.println("");

      System.out.printf("Bitte den Wechselkurs Euro>Pfund eingeben: ");
      double wechselkurs = scanner.nextDouble();

      System.out.printf("Bitte den Euro-Betrag eingeben: ");
      double betrag = scanner.nextDouble();


      
      System.out.println("");
      System.out.println("Bitte die Gebuehr eingeben.");
      System.out.println("Eingabeform: \"x Euro\" oder \"x Prozent\"");
      System.out.println("");
      
      String eingabe = scanner.next();
      String einheit = scanner.next();

      double gebuehr = 0;
      double einzahlung = 0;
      scanner.close();

      if(einheit.equals("Euro"))
      {
         gebuehr = Double.parseDouble(eingabe);
         einzahlung = gebuehr + betrag;
      }
      else if(einheit.equals("Prozent"))
      {
         gebuehr = Double.parseDouble(eingabe) * betrag / 100;
         einzahlung = gebuehr + betrag;
      }
      else
      {
         System.out.println("Ungueltige Eingabe");      
      }
      double pfund = wechselkurs * betrag; 
      

      System.out.println("");
      System.out.printf("Euro-Betrag:  %7.2f" + " Euro\n",betrag);
      System.out.printf("Pfund-Betrag: %7.2f" + " Pfund\n",pfund);
      System.out.printf("Gebuehr:      %7.2f" + " Euro\n",gebuehr);
      System.out.printf("Einzuzahlen:  %7.2f" + " Euro\n" , einzahlung);
      
   }
}