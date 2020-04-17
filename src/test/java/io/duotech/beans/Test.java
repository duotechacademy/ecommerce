package io.duotech.beans;

import com.github.javafaker.Faker;

public class Test {

	public static void main(String[] args) {


		Faker f = new Faker();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(f.internet().emailAddress());
		}

	}

}
