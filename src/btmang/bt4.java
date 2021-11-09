package btmang;

import java.util.Scanner;

public class bt4 {
	public static void InputArray(int []arr) {
        for (int i=0; i<=arr.length-1;i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr[i] = randomInt;
        }

    }
    public static void OutputArray(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Nguoc(int []arr) {

            for(int j = arr.length-1 ; j >= 0 ;j--){
            System.out.print(arr[j]+" ");
        }

    }

    public static void Xuoi(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Mang: ");
        int n = scanner.nextInt();
        int []arr = new int[n];
        InputArray(arr);
        System.out.println("Mang ban vua nhap : ");
        OutputArray(arr);
        System.out.println();
        System.out.println("Mang nhap tu trai sang phai : ");
        Xuoi(arr);
        System.out.println();
        System.out.println("Mang duoc in ra nguoc lai : ");
        Nguoc(arr);
    }

}