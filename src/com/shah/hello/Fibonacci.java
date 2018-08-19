package com.shah.hello;

import java.util.Scanner;

public class Fibonacci {
	
	private static Scanner input;

	public static void main(String arg[]) {
		input = new Scanner(System.in);
		int n, first_num=0, second_num=1, next_num=0;
		System.out.print("Enter the number of terms: ");
		n=input.nextInt();

		for(int i=1; i<=n; i++) {
			
			if(i==1) {
				System.out.print(first_num+"\t");
				continue;
			}
			if(i==2) {
				System.out.print(second_num+"\t");
				continue;
			}
			
			next_num=first_num+second_num;
			first_num=second_num;
			second_num=next_num;
			System.out.print(next_num+"\t");
		}
	
	}
}
