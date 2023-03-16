package Studentdetails;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Student
{
int rollNumber;
String name,course;
float marks1,marks2,marks3;

public float calculateTotal()
{
 float total=marks1+marks2+marks3;
 return total;
}

public  float calculateAverage()
{
  float avg=calculateTotal()/3;
  return avg;
}

public String calculateGrade()
{
 float avg = calculateAverage();
 String grade = avg>90 ? "A+" : avg>75 ? "A" : avg>50 ?"B" : avg>35 ? "D" : "F";
 return grade;
}

public void setrollNumber(int rollNumber)
{
  this.rollNumber=rollNumber;
}

public int getrollNumber()
{
  return rollNumber;
}
public void setName(String name)
{
  this.name=name;
}

public String getName()
{
  return name;
}

public void setCourse(String course)
{
  this.course=course;
}

public String getCourse()
{
  return course;
}

public void setMarks1(float marks1)
{
this.marks1=marks1;
}
public float getMarks1()
{
return marks1;
}
public void setMarks2(float marks2)
{
this.marks2=marks2;
}
public float getMarks2()
{
return marks2;
}
public void setMarks3(float marks3)
{
this.marks3=marks3;
}
public float getMarks3()
{
return marks3;
}



public String  tostring()
{
return "Student details:\nRoll Number = "+rollNumber+" \nName = "+name+"\nCourse = "+course+"\nTotal = "+calculateTotal()+"\nAverage = "+calculateAverage()+"\nGrade = "+calculateGrade();


}
}
	















