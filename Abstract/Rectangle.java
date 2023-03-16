import java.lang.*;
import java.io.*;
import java.util.*;

public class Rectangle extends Shape
{ 
  float l,b;
  public double perimeter()
{
   
   double perimeter=(2*(l+b));
   return perimeter;
}
 public double area()
{
    
    double area=(l*b);
    return area;
}
public Rectangle(float len,float wid)
{
     len=l;
     wid=b;
}
}
