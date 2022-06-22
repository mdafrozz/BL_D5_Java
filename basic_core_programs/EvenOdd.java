package basic_core_programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + " is a even number");
		else
			System.out.println(num + " is a odd number");
}
}