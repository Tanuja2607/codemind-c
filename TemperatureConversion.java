import java.util.Scanner;
class TemperatureConversion
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     float c,res;
     c=sc.nextFloat();
     res=(float)(c*1.8)+32;
     System.out.println("Temperature: "+res);
     System.out.printf("Temperature:%.2f",res);
     sc.close();
   }
}
