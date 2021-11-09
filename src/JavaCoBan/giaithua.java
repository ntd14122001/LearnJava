package JavaCoBan;

import java.util.Scanner;

public class giaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,fact=1;  
		  
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhap : ");
		        int number = scanner.nextInt();
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	}

