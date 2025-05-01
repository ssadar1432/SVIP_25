package com.svip;

import com.svip.SIP.Day1.EvenNumber;
import com.svip.SIP.Day1.EvenOrOdd;
import com.svip.SIP.Day1.FindEvenOrOdd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InterviewPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(InterviewPracticeApplication.class, args);
		System.out.println("Welcome To SpringBoot");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an option:");
		System.out.println("1. Even Number");
		System.out.println("2. EvenOrOdd Number");
		System.out.println("3. FindEvenOrOdd Number");
		System.out.println("4. reverseOrder Number");
		System.out.println("5. Duplicate Number");

		System.out.print("Choose an option: ");
		int choice = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		switch (choice) {
			case 1:
				System.out.println("You chose Option One.");
				EvenNumber ev=new EvenNumber();
				ev.FindEvenNumber();
				break;
			case 2:
				System.out.println("You chose Option Two.");
				EvenOrOdd evenOrOdd=new EvenOrOdd();
				evenOrOdd.FindEvenOrOdd(22);
				break;
			case 3:
				System.out.println("You chose Option Three.");
				FindEvenOrOdd findEvenOrOdd=new FindEvenOrOdd();
				findEvenOrOdd.EvenOrOddList();
				break;
			default:
				System.out.println("Invalid choice.");
				// Code to execute for an invalid choice
		}
		scanner.close();
	}

}
