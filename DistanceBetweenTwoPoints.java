import java.util.Scanner;
class DistanceBetweenTwoPoints
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int x1,x2,y1,y2;
   float dist;
    x1=sc.nextInt();
    x2=sc.nextInt();
    y1=sc.nextInt();
    y2=sc.nextInt();
     dist=(float) Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

System.out.println("Distance= "+dist);
sc.close();
}
}
