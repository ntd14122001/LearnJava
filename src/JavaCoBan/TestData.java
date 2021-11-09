package JavaCoBan;
import java.util.Scanner;
public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	      Scanner s = new Scanner(System.in);
	      System.out.print("Nhap So : ");
	      n = s.nextInt();
	        if(n > 0)
	        {
	            System.out.println("So Da Nhap "+ n +" La So Duong");
	        }
	        	else if(n < 0)
	        	{
	        		System.out.println("So Da Nhap "+ n +" La So Am");
	        	}
	        		else
	        			{
	        				System.out.println("So Da Nhap "+ n +" Khong Phai So Duong Cung Khong Phai So Am  ");
	        			}
	}

}
