package JavaCoBan;
import java.util.Scanner;
public class tamgiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap : ");
	        int tamgiac = scanner.nextInt();
	        
	    for (int i = tamgiac; i >= 1; --i) {
	    	
            for (int j = i; j >= 1; --j) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}