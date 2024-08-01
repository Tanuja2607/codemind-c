import java.util.Scanner;
class Areaofcircle
{
     public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     float area,radius;
     radius=sc.nextFloat();
     area=3.142f*radius*radius;
     System.out.println("Area of circle= "+area);
     System.out.printf("Area of circle= %.2f",area);
     sc.close();
     
}  
}
