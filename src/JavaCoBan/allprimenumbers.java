package JavaCoBan;
import java.util.Scanner;
public class allprimenumbers {
	public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        String  primeNumbers = "";
        System.out.println("Nhap :");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Cac so nguyen to tu 1 den "+ n +" la");
        System.out.println(primeNumbers);
    }
}