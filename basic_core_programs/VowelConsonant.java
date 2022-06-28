package basic_core_programs;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
	/* The code below will Check Whether an Alphabet is Vowel or Consonant*/
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabet: ");
		char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
	}

