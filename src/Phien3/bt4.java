package Phien3;

import static java.lang.Math.*;

import java.util.Scanner;  

public class bt4 {   
	static void calculateRoots(Double a, Double b)  
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
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhap a : ");
	    Double a = scanner.nextDouble();
	    System.out.print("Nhap b : ");
	    Double b = scanner.nextDouble();
	    calculateRoots(a, b);  
	}
}