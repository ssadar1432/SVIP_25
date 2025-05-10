package com.svip;

import com.svip.SIP.Day1.*;
import com.svip.SIP.Day2.*;
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
		System.out.println("4. Duplicate Number");
		System.out.println("5. Duplicate String");
		System.out.println("6. Frequecy Charecter");
		System.out.println("7. Reverse Order");
		System.out.println("8. Reverse String");
		System.out.println("9. Max and Min Number");
		System.out.println("10. Max 3 and Min 3 Number");
		System.out.println("11. Second Largest Number");
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
			case 4:
				System.out.println("You chose Option Four.");
				DuplicateNumber duplicateNumber=new DuplicateNumber();
				System.out.println("Below are Duplicate Number.");
				duplicateNumber.findDuplicateNumber();
				System.out.println("Below are Unique Number.");
				duplicateNumber.findUniqueNumber();
				break;
			case 5:
				System.out.println("You chose Option Five.");
				DuplicateName duplicateName=new DuplicateName();
				duplicateName.UniqueNameFromList();
				duplicateName.DuplicateNameFromList();
				break;
			case 6:
				System.out.println("You chose Option Six.");
				FrequencyOfCharecter freChar=new FrequencyOfCharecter();
				freChar.FrequencyOfCharecter();
				System.out.println("-----------------");
				freChar.FrequecyOfWord();
				break;
			case 7:
				System.out.println("You chose Option seven.");
				ReverseOrderList reverse=new ReverseOrderList();
				reverse.ReverseOrder();
				break;
			case 8:
				System.out.println("You chose Option Eight.");
				ReverseString reverseString=new ReverseString();
				reverseString.reverseString();
				break;
			case 9:
				System.out.println("You chose Option nine.");
				MaxAndMinNumber maxAndMinNumber=new MaxAndMinNumber();
				maxAndMinNumber.maxAndMinNumber();
				break;

			case 10:
				System.out.println("You chose Option nine.");
				ThreeMaxAndMin maxAndMin=new ThreeMaxAndMin();
				maxAndMin.ThreeMaxAndMin();
				break;

			case 11:
				System.out.println("You chose Option nine.");
				SecondlargestNumber secondlargestNumber=new SecondlargestNumber();
				secondlargestNumber.secondLargestNumber();
				break;

			default:
				System.out.println("Invalid choice.");
				// Code to execute for an invalid choice
		}
		scanner.close();
	}

}
