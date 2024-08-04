import java.util.Scanner;
class SurfaceAreaofSphere
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
float r,area;
r=sc.nextFloat();
area=(float)(4*314*r*r);
System.out.println("SurfaceAreaofSphere= "+area);
sc.close(); 
}
}
