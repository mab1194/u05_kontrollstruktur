import java.util. *;

public class PrimFaktorenZerleger
{
   public static void main(String[] args)
   {
      System.out.print("Zu zerlegende Zahl: ");
      Scanner scanner = new Scanner(System.in);
      int zuZerlegendeZahl = scanner.nextInt();
      System.out.print(" = ");
      
      int primfaktor = 0;
      

      for(int faktor = 2; faktor<=zuZerlegendeZahl; faktor++)
      {  
         boolean istPrimzahl = true;
   
         for(int teiler = 2; teiler <= faktor-1 ; teiler++)
         {
            if(faktor % teiler == 0)
            {
               istPrimzahl = false;
               break;
            }
         }
         if(istPrimzahl == true)
         {  
               
            primfaktor  = faktor;
             
            while(zuZerlegendeZahl % primfaktor == 0)
            {
               zuZerlegendeZahl = zuZerlegendeZahl / primfaktor;
         
               if(zuZerlegendeZahl>1)
               {
                  System.out.print(primfaktor + " * ");  
               }
               else
               {
                  System.out.print(primfaktor + "\n");           
               }
                
            }
         }   
      }
   }
}   