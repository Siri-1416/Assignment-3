import java.lang.*;
import java.io.*;
import java.util.*;

public class Circle extends Shape
{ 
  float r;
  public double perimeter()
{
   
   double perimeter=(2*Math.PI*r);
   return perimeter;
}
 public double area()
{
    
    double area=(Math.PI*r*r);
    return area;
}
public Circle(float radius)
{
     r=radius;
}
}
