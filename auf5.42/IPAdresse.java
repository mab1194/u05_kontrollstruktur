import java.util.*;

public class IPAdresse
{
   public static void main(String[]args)
   {
      System.out.println("");
      System.out.printf("IP-Adresse (dezimal):  ");
      Scanner scanner = new Scanner(System.in);
      String IpAdresse = scanner.nextLine();
      System.out.println(IpAdresse);
      System.out.println("");
      System.out.println("IP-Adresse (binaer):");

      StringTokenizer st = new StringTokenizer(IpAdresse, ".");
      while(st.hasMoreTokens())
      {
         int Ip = Integer.parseInt(st.nextToken());
         System.out.print(String.format("%8s" , Integer.toBinaryString(Ip)).replace(' ','0'));
         
         if (st.hasMoreTokens())
         {
            System.out.print(".");         
         }
      }
      
      System.out.println("");
   }

}