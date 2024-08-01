import java.util.Scanner;
class Simpleintrest
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
   float P,T,R,SI;
     P=sc.nextFloat();
    T=sc.nextFloat();
    R=sc.nextFloat();
    SI=(P*T*R)/100.0f;
System.out.printf("Simple intrest is:%.2f",SI);
sc.close();
}
}
