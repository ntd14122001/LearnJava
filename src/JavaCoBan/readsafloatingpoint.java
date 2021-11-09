package JavaCoBan;
import java.util.Scanner;
public class readsafloatingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("Nhap So: ");
	        double input = in.nextDouble();

	        if (input > 0)
	        {
	            if (input < 1)
	            {
	                System.out.println("small Positive  ");
	            }
	            	else if (input > 1000000)
	            	{
	            		System.out.println("large Positive  ");
	            	}
	            		else
	            			{
	            				System.out.println("Positive ");
	            			}
	        }
	        else if (input < 0)
	        {
	            if (Math.abs(input) < 1)
	            {
	                System.out.println("small Negative ");
	            }
	            else if (Math.abs(input) > 1000000)
	            {
	                System.out.println("large Negative ");
	            }
	            else
	            {
	                System.out.println("Negative ");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }
	}

}
