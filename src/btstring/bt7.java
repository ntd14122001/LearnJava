package btstring;

import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
public class bt7 {
	public static void main(String[] args)
	{
		 System.out.print("Nhap chuoi: ");
		  Scanner scanner = new Scanner(System.in);
		  String input = scanner.nextLine();

		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}
