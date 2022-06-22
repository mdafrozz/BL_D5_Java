package basic_core_programs;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabet: ");
		char cr = sc.next().charAt(0);
		switch (cr) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(cr + " is vowel");
            break;
        default:
            System.out.println(cr + " is consonant");
    }
	}

}
