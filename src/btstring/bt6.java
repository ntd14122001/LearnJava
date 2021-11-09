package btstring;

import java.lang.*;
import java.io.*;
import java.util.*;
public class bt6 {
	public static void main(String[] args) {
        String chuoi;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.print("Nhap vao ki tu can tim : " );
        char kyTu = ' ';
        try
        {
            kyTu = (char) System.in.read();
        }
        catch(Exception e)
        {
              System.out.println("Nhap sai!");
        }
        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Vi tri "+i+" xuat hien ki tu "+ kyTu);
                count++;
            }
        }

        System.out.println("So lan xuat hien ki tu :" + kyTu +
            " trong chuoi " + chuoi + " = " + count);
    }
}