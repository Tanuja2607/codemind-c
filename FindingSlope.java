import java.util.Scanner;
class FindingSlope
{
  public static void main(String args[])
{
   Scanner sc=new Scanner (System.in);
   float a,b,c,d,res;
   a=sc.nextFloat();
   b=sc.nextFloat();
   c=sc.nextFloat();
   d=sc.nextFloat();
   res=(float)((d-c)/(b-a));
   System.out.println("Slope= "+res);
   sc.close();
}
}
