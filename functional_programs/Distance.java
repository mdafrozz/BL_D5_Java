package functional_programs;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
		//int x = Integer.parseInt(args[0]);
        //int y = Integer.parseInt(args[1]);
		
		int x, y;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of X:");
		x = sc.nextInt();
		
		System.out.print("Enter value of Y:");
		y = sc.nextInt();
        
        double dist = Math.sqrt(x*x + y*y);
        
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}
	
}
