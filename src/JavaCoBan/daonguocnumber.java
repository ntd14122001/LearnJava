package JavaCoBan;

import java.util.Scanner;

public class daonguocnumber {

	public static void main(String[] args){  
		
	int reverse = 0;  
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Nhap : ");
     int number = scanner.nextInt();

     
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("So dao nguoc la " + reverse);  
	}  
}  
