package Phien3;

import static java.lang.Math.*;

import java.util.Scanner;  

public class bt5 {   
		static void calculateRoots(int a, int b, int c)  
		{     
			if (a == 0)   
			{  
				System.out.println("a Khac = 0.");  
				return;  
			}  
		int d = b * b - 4 * a * c;  
		double sqrtval = sqrt(abs(d));  
			if (d > 0)   
			{  
				System.out.println("Phuong Trinh Co 2 Nghiem. \n");  
				System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
			}  
		else if (d == 0)   
			{  
				System.out.println("Phuong Trinh Co Nghiem Kep. \n");  
				System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
			}  
		else   
			{  
				System.out.println("Phuong Trinh Vo Nghiem \n");  
				System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
			}  
		}  
		public static void main(String args[]){  
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap a: ");
			int a = scanner.nextInt();
			System.out.println("Nhap b: ");
			int b = scanner.nextInt();
			System.out.println("Nhap c: ");
			int c = scanner.nextInt();   
			calculateRoots(a, b, c);   
	}  
}  