package JavaCoBan;
import java.util.Scanner;
public class fivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0,s=0;
		double avg;
		{
		   
	        System.out.println("Nhap 5 So : ");  
	         
		}
			for (i=0;i<5;i++)
			{
			    Scanner in = new Scanner(System.in);
			    n = in.nextInt();
			    
	  		s +=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
	 
	}
	}
