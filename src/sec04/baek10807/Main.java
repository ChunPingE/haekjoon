package sec04.baek10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0 ; i < arr.length ; i++ ) {
			if (arr[i] == v) {
				count++;
			}
		}
		System.out.println(count);

	}

}

