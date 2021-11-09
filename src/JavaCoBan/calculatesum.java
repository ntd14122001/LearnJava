package JavaCoBan;
import java.util.Scanner;
public class calculatesum {
   static int sumall(int n)
   {
       int result = 0;
       
       for (int x = 1; x <= n; x++)
           result += sumcacchuso(x);
     
       return result;
   }
     
   static int sumcacchuso(int x)
   {
       int sum = 0;
       while (x != 0)
       {
           sum += x % 10;
           x   = x / 10;
       }
       return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap : ");
        int input = scanner.nextInt();
        
	        System.out.println("Tong cac chu so"
	                          +" tu 1 den " + input + " la "
	                          + sumall(input));
	        
	}

}
