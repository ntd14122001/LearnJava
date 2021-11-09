package JavaCoBan;
import java.util.Scanner;
public class threedecimalplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner three = new Scanner(System.in);

	        System.out.print("Nhap So 1 : ");
	        double x = three.nextDouble();
	        System.out.print("Nhap So 2 : ");
	        double y = three.nextDouble();
	        
	        x = Math.round(x * 1000);
	        x = x / 1000;

	        y = Math.round(y * 1000);
	        y = y / 1000;

	        if (x == y)
	        {
	            System.out.println("2 So Giong Nhau");
	        }
	        else
	        {
	            System.out.println("2 So Khac Nhau");
	        }
	}

}
