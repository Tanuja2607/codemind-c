import java.util.Scanner;
class PythagorusTheorem  
{
    public static void main(String args[])
{
    Scanner py=new Scanner(System.in);
    float s1,s2,res;
    s1=py.nextFloat();
    s2=py.nextFloat();
    res=(float)Math.sqrt((s1*s1)+(s2*s2));
System.out.println("Pythogorus theorem= "+res);
py.close();

}
}
