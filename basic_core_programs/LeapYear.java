package basic_core_programs;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
		
		int year;
		
		System.out.print("Enter Year: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		year= sc.nextInt();
		
		 if(year>999 && year<10000)
	        {
			 
		 if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		 {
	         System.out.println("Entered year is a Leap Year");
		 }
		 else
		 {
			 System.out.println("Entered year is a not Leap Year");
		 }
	        }
		 else
			 System.out.println("Enter a valid year!");
	     }
	}
