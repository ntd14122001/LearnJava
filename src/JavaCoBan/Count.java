package JavaCoBan;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count = 0;
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap : ");
	        long num = scanner.nextInt();
	        
		    while (num != 0) {
		    	
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Tong chu so : " + count);
		  }
		}