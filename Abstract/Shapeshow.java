import java.lang.*;
import java.io.*;
import java.util.*;

public class Shapeshow 
{
   public static void main(String args[])
{
   Shape c=new Circle(4);
   Shape r=new Rectangle(2.5f,3.0f);
   System.out.println("Perimeter of circle is:"+c.perimeter());
   System.out.println("area of circle is:"+c.area());
   System.out.println("Perimeter of rectangle is:"+r.perimeter());
   System.out.println("area of rectangle is:"+r.area());
}
}