import java.io.*;

public class ArabischeZahlen
{
   public static void main(String[] args) throws Exception
   {
      // Deklarationen
      int arabischeZahl;
      String roemischeZahl = "Roemische Zahl: ";

      // Eingabe einlesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.print("Arabische Zahl: ");
      String eingabe = gepufferterLeser.readLine();
      arabischeZahl  = Integer.parseInt(eingabe);
         
      while(arabischeZahl > 0)
      {
         if((arabischeZahl >= 1000))
         {
            arabischeZahl = arabischeZahl - 1000;
           
            roemischeZahl = roemischeZahl + "M";
         }
         else if (arabischeZahl < 1000 && arabischeZahl >= 900)
         {
            arabischeZahl = arabischeZahl - 900;
           
            roemischeZahl = roemischeZahl + "CM"; 
         }         
         else if(arabischeZahl >= 500)
         {
            arabischeZahl = arabischeZahl - 500;
            roemischeZahl = roemischeZahl + "D"; 
         }
         else if(arabischeZahl >= 400 && arabischeZahl < 500)
         {
            arabischeZahl = arabischeZahl - 400;
            roemischeZahl = roemischeZahl + "CD";        
         }
         else if(arabischeZahl >= 100)
         {
            arabischeZahl = arabischeZahl - 100;
            roemischeZahl = roemischeZahl + "C"; 
         }
         else if(arabischeZahl >= 90 && arabischeZahl < 100)
         {
            arabischeZahl = arabischeZahl - 90;
            roemischeZahl = roemischeZahl + "XC";
         }        
         else if(arabischeZahl >= 50)
         {
            arabischeZahl = arabischeZahl - 50;
            roemischeZahl = roemischeZahl + "L"; 
         }
         else if(arabischeZahl >= 40 && arabischeZahl < 50)
         {
            arabischeZahl = arabischeZahl - 40;
            roemischeZahl = roemischeZahl + "XL";
         }
         else if(arabischeZahl >= 10)
         {
            arabischeZahl = arabischeZahl - 10;
            roemischeZahl = roemischeZahl + "X"; 
         }
         else if(arabischeZahl >= 9 && arabischeZahl < 10)
         {
            arabischeZahl = arabischeZahl - 9;
            roemischeZahl = roemischeZahl + "IX";
         }
         else if(arabischeZahl >= 5)
         {
            arabischeZahl = arabischeZahl - 5;
            roemischeZahl = roemischeZahl + "V"; 
         }
         else if(arabischeZahl >= 4 && arabischeZahl < 5)
         {
            arabischeZahl = arabischeZahl - 4;
            roemischeZahl = roemischeZahl + "IV";
         }
         else if(arabischeZahl > 0 && arabischeZahl < 4)
         {
            arabischeZahl = arabischeZahl - 1;
            roemischeZahl = roemischeZahl + "I"; 
         }
      }
      System.out.println(roemischeZahl);
      System.out.print("\n");
   }   
}