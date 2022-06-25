package basic_core_programs;

import java.util.Scanner;

public class SwapTwoNumbers {
public static void main(String[] args) {
		
		int a, b, c;
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter two numbers to swap:"); 
		 a = sc.nextInt(); 
		 b = sc.nextInt(); 
		 
		 System.out.println("Before swapping the numbers are: "+a +"  "+ b); 
		 
		 c = a;
		 a = b;
		 b = c;
		 System.out.println("After swapping the numbers are: "+a +"   " + b); //After swapping
		 
	}
}
