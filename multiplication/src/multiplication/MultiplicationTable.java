package multiplication;

import java.util.Scanner;

public class MultiplicationTable {

	static void level2 () {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int j = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			int k = i*j;
			System.out.println(j + " * " + i + " = " + k);
		}
		sc.close();
	}



	public static void main(String[] args) {
		level2();
	}

}
