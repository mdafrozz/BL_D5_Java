package basic_core_programs;

import java.util.Scanner;

public class SwapTwoNumbers {
public static void main(String[] args) {
		
		int a, b, c;
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter the value of A and B:"); 
		 a = sc.nextInt(); 
		 b = sc.nextInt(); 
		 
		 System.out.println("Before swapping numbers: "+a +"  "+ b); 
		 
		 c = a;
		 a = b;
		 b = c;
		 System.out.println("After swapping: "+a +"   " + b); //After swapping
		 
		 //Task
		 System.out.println("After combine: " + a + b);
		 int add = a+b;
		 System.out.println("After adding: " + add);
		 int sum = add+30;
		 System.out.println("Sum of digit: " + sum);

	}
}
