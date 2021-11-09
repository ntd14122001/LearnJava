package Phien3;

import java.util.Scanner;

public class bt3 {   
	public static void inputt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap : ");
		int n = scanner.nextInt();
		if(n<=0) 
			{
				System.out.println("Nhap sai , Nhap lai : ");
			}
		else 
		{
			System.out.println("Nhap vao thong diep: ");
			String chuoi = scanner.next();
			System.out.println("So thong diep in ra: "+n);
			for(int i=0 ; i<n ; i++)
			{
				System.out.println(chuoi);
			}
		}
}
	public static void main(String[] args) {
		inputt();
	}

}