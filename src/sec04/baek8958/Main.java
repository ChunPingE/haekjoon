package sec04.baek8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
	
		for (int i = 0 ; i < T ; i++) {
			int sum = 0;
			int count = 0;
			String str = sc.next();
			for (int j = 0; j < str.length(); j ++) {
				if(str.charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
				
			}
			System.out.println(sum);
			
		}

		
		
		
	}

}

