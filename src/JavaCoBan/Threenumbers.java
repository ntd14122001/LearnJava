package JavaCoBan;
import java.util.Scanner;
public class Threenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a;  
		  int b;   
		  int c;
	      Scanner number1 = new Scanner(System.in);
	      System.out.print("Nhap So : ");
	      a = number1.nextInt();
	      Scanner number2 = new Scanner(System.in);
	      System.out.print("Nhap So : ");
	      b = number2.nextInt();
	      Scanner number3 = new Scanner(System.in);
	      System.out.print("Nhap So : ");
	      c = number3.nextInt();
	      if(a > b && a > c)
	        {
	            System.out.println("So Lon Nhat :"+ a );
	        }
	        	else if(b > a && b > c)
	        	{
	        		System.out.println("So Lon Nhat :"+ b );
	        	}
	        		else
	        			{
	        			System.out.println("So Lon Nhat :"+ c );
	        			}
	}

}
