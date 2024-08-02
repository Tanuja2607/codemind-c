import java.util.Scanner;
class BMI
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
   float w,h,res;
   w=sc.nextFloat();
   h=sc.nextFloat();
   res=(w/(h*h));
 System.out.println("result is: "+res);
sc.close(); 
}
}
