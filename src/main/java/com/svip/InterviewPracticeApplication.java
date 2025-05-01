package com.svip;

import com.svip.VIP.Day1.EvenOdd;
import com.svip.VIP.Day1.SortString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(InterviewPracticeApplication.class, args);
		System.out.println("Welcome To SpringBoot");
//Sorting a String using java 8
		SortString b=new SortString();
		b.stringSort("BGFDEA");

//EvenOdd number

		EvenOdd evenOdd=new EvenOdd();
		evenOdd.evenOdd(9);
	}

}
