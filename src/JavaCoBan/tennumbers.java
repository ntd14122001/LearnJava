package JavaCoBan;
import java.util.Scanner;
public class tennumbers {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap : ");
	        int num = scanner.nextInt();

	        System.out.println("\nCac so tu nhien tu 1 den " + num);

	        int i = 0;

	        while (i <= num) {

	            System.out.print(i + " ");
	            i++;
	        }
	}

}
