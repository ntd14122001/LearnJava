package btstring;

import java.util.Scanner;

public class bt4 {

	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	         Scanner sc = new Scanner(System.in);
	            String message;
	            System.out.println("Nhap chuoi: ");
	            message = sc.nextLine();
	            String[] arrOfStr = message.split(" ");

	            for (String a : arrOfStr)
	                System.out.println(a);
	    }

	}