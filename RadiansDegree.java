import java.util.Scanner;
class RadianstoDegree
{
    public static void main(String args[])
    {
      float rad,deg;
      Scanner sc=new Scanner(System.in);
      deg=sc.nextFloat();
      rad=(float)(deg*(3.14/180));
      System.out.println("Radian= "+rad); 
      sc.close(); 
    }
}
