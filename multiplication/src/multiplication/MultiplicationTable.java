package multiplication;

import java.util.Scanner;

public class MultiplicationTable {

	static void level2 () {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter the number : ");
		int j = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			int k = i*j;
			System.out.println(j + " * " + i + " = " + k);
		}
		sc.close();
	}



	public static void main(String[] args) {
		level2();
	}

}
