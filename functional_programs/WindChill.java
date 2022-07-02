package functional_programs;

import java.util.Scanner;
//program that takes two double command-line arguments t and v and prints the wind chill.
public class WindChill {
	
	public static void main(String[] args) {

	double t, v;
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Temperature(t) value:");
	t = sc.nextDouble();
	System.out.println("Enter Speed(v) value:");
	v = sc.nextDouble();
	
    double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
    System.out.println("Temperature = " + t);
    System.out.println("Wind speed  = " + v);
    System.out.println("Wind chill  = " + w);

	}
}
