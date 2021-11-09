package Phien2;
import java.util.Scanner;
public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap n : ");
	int number = scanner.nextInt();
	        long fact = 1;
	        for(int i = 1; i <= number; i++)
	        {
	            fact = fact * i;
	        }
	        System.out.println("Giai thua cua "+number+" la: "+fact);
	}

}