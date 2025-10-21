import java.util.*;

public class Spedition
{
    public static void main(String [] args)
    {
        int maxLadegewicht1 = 10;
        int ladegewicht1 = 0;
        int ladegewicht2 = 0;
        int maxLadegewicht2 = 10;
        int maxLadevolumen1 = 20;
        int maxLadevolumen2 = 20; 
        int ladevolumen1 = 0;
        int ladevolumen2 = 0;
        
        int gewicht;
        int volumen;
        boolean wagen1Voll = false;
        boolean wagen2Voll = false;
        boolean wagenbefuellt = false;
        System.out.printf("Wagen1: Maximales Ladegewicht %2d" + ", Maximales Ladevolumen %2d" +  "\n" + "        Aktuelles Ladegewicht %2d" + ", Aktuelles Ladevolumen %2d" + "\n" ,maxLadegewicht1,maxLadevolumen1,ladegewicht1,ladevolumen1);
        System.out.println("");
        System.out.printf("Wagen2: Maximales Ladegewicht %2d" + ", Maximales Ladevolumen %2d" +  "\n" + "        Aktuelles Ladegewicht %2d" + ", Aktuelles Ladevolumen %2d" + "\n" , maxLadegewicht2, maxLadevolumen2, ladegewicht2, ladevolumen2);   
        
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Gewicht der naechsten Ladung:  ");
            gewicht = scanner.nextInt();
        
            System.out.printf("Volumen der naechsten Ladung:  ");
            volumen = scanner.nextInt();
            System.out.printf("\n");
        
            if((gewicht + ladegewicht1) > maxLadegewicht1 || (volumen + ladevolumen1) > maxLadevolumen1)
            {
               if((gewicht + ladegewicht2) > maxLadegewicht2 || (volumen + ladevolumen2) > maxLadevolumen2)
               {
                  System.out.println("Verladung nicht moeglich");
               }
               else
               {
                  ladegewicht2 = ladegewicht2 + gewicht;
                  ladevolumen2 = ladevolumen2 + volumen;
              
                  System.out.printf("Wagen2: Aktuelles Ladegewicht %2d" + ", Aktuelles Ladevolumen %2d" + "\n" , ladegewicht2, ladevolumen2);
               
                  if(ladegewicht2 == maxLadegewicht2 || ladevolumen2 == maxLadevolumen2)
                  {
                     wagen2Voll = true;
                     System.out.println("Wagen2 ist voll");
                  }
               }
            }
            else
            {
               ladegewicht1 = ladegewicht1 + gewicht;
               ladevolumen1 = ladevolumen1 + volumen;
              
             
               System.out.printf("Wagen1: Aktuelles Ladegewicht %2d" + ", Aktuelles Ladevolumen %2d" + "\n" , ladegewicht1, ladevolumen1);
               if(ladegewicht1 == maxLadegewicht1 || ladevolumen1 == maxLadevolumen1)
               {
                  wagen1Voll = true;
                  System.out.println("Wagen1 ist voll");
               } 
            }
            if (wagen1Voll == true  && wagen2Voll == true)
            {
               wagenbefuellt = true;
            }
        }
        while(wagenbefuellt == false);
        
        if(wagenbefuellt == true)
        {
          System.out.println("");
          System.out.println("Beide Wagen sind voll");
        }
    }
}