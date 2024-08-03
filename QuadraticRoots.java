import java.util.Scanner;
class QuadraticRoot
{
   public static void main(String args[])
  {
    Scanner py=new Scanner(System.in);
    float a,b,c,res1,res2;
    a=py.nextFloat();
    b=py.nextFloat();
    c=py.nextFloat();
    res1=(float)((-b+Math.sqrt(b*b-4*a*c)/(2*a)));
    res2=(float)((-b-Math.sqrt(b*b-4*a*c)/(2*a)));
    System.out.println("Roots: "+res1+"and"+res2);
    py.close();
    
  }
}
