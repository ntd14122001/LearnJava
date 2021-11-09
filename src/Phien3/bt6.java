package Phien3;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class bt6 {

	static void bacnhat(Double a, Double b)  
	{     
		Double run;

	    if (a != 0) 
	    {
	    	run = (double) (-b/a);
	    	System.out.println("x = " + (run)); 
	    }
	    else 
	    {
	        System.out.println("X");
	        return;
	    }
	}  
	static void bac2(int a, int b, int c)  
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon bac phuong trinh ban muon giai bac nhat(1), bac hai(2): ");
		int luachon = scanner.nextInt();
		if (luachon==1)
		{
			 	System.out.print("Nhap a : ");
			    Double a = scanner.nextDouble();
			    System.out.print("Nhap b : ");
			    Double b = scanner.nextDouble();
			    bacnhat(a, b);  
		}
		else if (luachon==2)
		{
			System.out.println("Nhap a: ");
			int a = scanner.nextInt();
			System.out.println("Nhap b: ");
			int b = scanner.nextInt();
			System.out.println("Nhap c: ");
			int c = scanner.nextInt();   
			bac2(a, b, c);   
		}
	}

}
