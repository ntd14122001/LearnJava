package JavaCoBan;

import java.util.Scanner;  
public class bt6
{  
public static void main(String[] Strings)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Nhập a: ");  
double a = input.nextDouble();  
System.out.print("Nhập b: ");  
double b = input.nextDouble();  
System.out.print("Nhập c: ");  
double c = input.nextDouble();  
double d= b * b - 4.0 * a * c;  
if (d> 0.0)   
{  
double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
System.out.println("Phương trình có 2 nghiệm là " + r1 + " và " + r2);  
}   
else if (d == 0.0)   
{  
double r1 = -b / (2.0 * a);  
System.out.println("Phương trình có nghiệm kép: " + r1);  
}   
else   
{  
System.out.println("Vô nghiệm.");  
}  
}  
}  