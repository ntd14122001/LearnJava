package Phien2;
import java.util.Scanner;
public class bt1 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a;
		for(a=10 ; a<=200 ; a++) {
			if(a % 7 == 0 && a % 5 != 0) {
				System.out.print( a + " ");
			}
		}
	}

}