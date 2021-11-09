package Phien2;
import java.util.Scanner;
public class bt7 {
		 private static Scanner scanner = new Scanner(System.in);
		    public static int a = 10;
		     
		    public static void main(String[] args) {
		        System.out.print("Nhap so nguyen duong : ");
		        int n = scanner.nextInt();
		        System.out.printf("Tong cac chu so "
		                + "cua %d la: %d", n, tong(n));
		    }
		    public static int tong(int n) {
		        int total = 0;
		        do {
		            total = total + n % a;
		            n = n / a;
		        } while (n > 0);
		        return total;
		    }
		}