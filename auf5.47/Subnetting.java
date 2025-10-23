import java.io.*;
import java.util.*;

public class Subnetting
{
   public static void main(String[] args) throws Exception
   {
      String ipDezimal;
      String subnetmaskDezimal;
      
 
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);
  
      System.out.println("");
      System.out.print("IP-Adresse   (dezimal): ");
      String eingabe = gepufferterLeser.readLine();
      ipDezimal      = eingabe;
      
      System.out.print("Subnetmask   (dezimal): ");
      eingabe    = gepufferterLeser.readLine();
      subnetmaskDezimal = eingabe;
      
      System.out.print("\n");
      System.out.print("IP-Adresse   (binaer) : ");
      StringTokenizer ipAdresse = new StringTokenizer(ipDezimal, ".");

      while(ipAdresse.hasMoreTokens())
      {
         int ipBin = Integer.parseInt(ipAdresse.nextToken());
         System.out.print(String.format("%8s" , Integer.toBinaryString(ipBin)).replace(' ','0'));
         
         if (ipAdresse.hasMoreTokens())
         {
            System.out.print(".");         
         }
      }
      
      System.out.print("\n");
      System.out.print("Subnetmask   (binaer) : ");
      StringTokenizer subnetmask = new StringTokenizer(subnetmaskDezimal, ".");

      while(subnetmask.hasMoreTokens())
      {
         int subnetmaskBin = Integer.parseInt(subnetmask.nextToken());
         System.out.print(String.format("%8s" , Integer.toBinaryString(subnetmaskBin)).replace(' ','0'));
         
         if (subnetmask.hasMoreTokens())
         {
            System.out.print(".");         
         }
      }
      
      System.out.print("\n");
      System.out.print("\n");
      System.out.print("Netzadresse  (binaer) : ");
     
      StringTokenizer ipAdresse2 = new StringTokenizer(ipDezimal, ".");
      StringTokenizer subnetmask2 = new StringTokenizer(subnetmaskDezimal, ".");

      String netzadresseBinaer="";      
      while(ipAdresse2.hasMoreTokens() && subnetmask2.hasMoreTokens())
      {
         int ipBin            = Integer.parseInt(ipAdresse2.nextToken());
         int subnetmaskBin    = Integer.parseInt(subnetmask2.nextToken());
         int netzadresseBin   = ipBin & subnetmaskBin;
      
         System.out.print(String.format("%8s" , Integer.toBinaryString(netzadresseBin)).replace(' ','0'));
         netzadresseBinaer = netzadresseBinaer + netzadresseBin;

         if (ipAdresse2.hasMoreTokens() && subnetmask2.hasMoreTokens())
         {
            System.out.print(".");
            netzadresseBinaer = netzadresseBinaer + ".";     
         }
      }
      
      System.out.print("\n");
       
      System.out.println("Netzadresse  (dezimal): " + netzadresseBinaer);
      System.out.println("");
      
   }
}