import java.io.*;

public class ArabischeZahlen
{
   public static void main(String[] args) throws Exception
   {
      // Deklarationen
      int arabischeZahl;
      String roemischeZahl;

      // Eingabe einlesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.print("Arabische Zahl: ");
      String eingabe = gepufferterLeser.readLine();
      arabischeZahl  = Integer.parseInt(eingabe);
         
      while(arabischeZahl>0)
      {
         if((arabischeZahl>=1000))
         {
            arabischeZahl = arabischeZahl - 1000;
           
            System.out.print("M");
         }
         else if (arabischeZahl<1000 && arabischeZahl>=900)
         {
            arabischeZahl = arabischeZahl - 900;
           
            System.out.print("CM"); 
         }         
         else if(arabischeZahl>=500)
         {
            arabischeZahl = arabischeZahl - 500;
            System.out.print("D"); 
         }
         else if(arabischeZahl>=400 && arabischeZahl<500)
         {
            arabischeZahl = arabischeZahl - 400;
            System.out.print("CD");        
         }
         else if(arabischeZahl>=100)
         {
            arabischeZahl = arabischeZahl - 100;
            System.out.print("C"); 
         }
         else if(arabischeZahl >=90 && arabischeZahl<100)
         {
            arabischeZahl = arabischeZahl - 90;
            System.out.print("XC");
         }        
         else if(arabischeZahl>=50)
         {
            arabischeZahl = arabischeZahl - 50;
            System.out.print("L"); 
         }
         else if(arabischeZahl>=40 && arabischeZahl<50)
         {
            arabischeZahl = arabischeZahl - 40;
            System.out.print("XL");
         }
         else if(arabischeZahl>=10)
         {
            arabischeZahl = arabischeZahl - 10;
            System.out.print("X"); 
         }
         else if(arabischeZahl>=9 && arabischeZahl<10)
         {
            arabischeZahl = arabischeZahl - 9;
            System.out.print("IX");
         }
         else if(arabischeZahl>=5)
         {
            arabischeZahl = arabischeZahl - 5;
            System.out.print("V"); 
         }
         else if(arabischeZahl>=4 && arabischeZahl<5)
         {
            arabischeZahl = arabischeZahl - 4;
            System.out.print("IV");
         }
         else if(arabischeZahl>0 && arabischeZahl<4)
         {
            arabischeZahl = arabischeZahl - 1;
            System.out.print("I"); 
         }
      }
      System.out.print("\n");
   }   
}