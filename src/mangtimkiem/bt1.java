package mangtimkiem;
import java.util.Scanner;
public class bt1 {
		
		public static void InputArray(int []arr) {
			for (int i=0; i<=arr.length-1;i++) {
				double randomDouble = Math.random();
	            randomDouble = randomDouble * 100 + 1;
	            int randomInt = (int) randomDouble;
				arr[i] = randomInt;
			}
			
		}
		
		public static void Find(int []arr, int item) {
			int index = 0;
			for (int i=0; i<=arr.length-1; i++) {
				if (arr[i] == item) {
					index = i;
					break;
				} else {
					index = -1;
				}
			}
			System.out.println("So tim kiem la : " + index);
		}
		
		public static void OutputArray(int []arr) {
			for (int i=0; i<=arr.length-1; i++) {
				System.out.print(arr[i] + " ");
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.print("Do dai mang : ");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			InputArray(arr);
			OutputArray(arr);
			System.out.println();
			System.out.print("So can tim : ");
			int item = scanner.nextInt();
			Find(arr, item);
			scanner.close();
		}

	}