package checkITNumber;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Student std = new Student("IT21013096", "Sunera");

		std.display();

		// if you want to get user inputs..

		System.out.println("Same thing using user Input");

		Scanner scn = new Scanner(System.in);

		System.out.print("Input Name : ");
		String name = scn.next();

		System.out.print("Input IT : ");
		String IT = scn.next();

		Student std1 = new Student(IT, name);
		std1.display();

		scn.close();
	}
}
