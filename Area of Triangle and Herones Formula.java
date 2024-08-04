import java.util.Scanner;
class AreaofTriangleAndHeronsFormula
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float a,b,c,area,s;
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
    s=sc.nextFloat(); 
    area=(float)((a+b+c)/2);
    s=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    System.out.println("Area of triangle= "+area);
    System.out.println("Herons Formula= "+s);
    sc.close();    
  }
}
