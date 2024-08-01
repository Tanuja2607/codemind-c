import java.util.Scanner;
class PerimeterofRectangle
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    float l,b,per;
    l=sc.nextFloat();
    b=sc.nextFloat();
    per=2*(l+b);
System.out.println("Perimeter of Rectangle= "+per);
sc.close();

}
}
