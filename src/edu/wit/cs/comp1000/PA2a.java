package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
/** 
 * Programming Assignment 2 part A is requesting us to write a program that reads in five whole numbers from the user. 
 * We would then use these numbers to state the sum of all positive, all non-positive numbers, and all five numbers.
 * We would also get the average of all positive numbers, all non-positive numbers, and the average of all five numbers. 
 * 
 * @author Tyler Stevens
 */

public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		int posNum = 0;
		int nonPosNum = 0;
		int sumNum = 0;
		int pos = 0;
		int neg = 0;
		double avgPos, avgNeg, avgTotal;
		
		// User inputs the following numbers that will be saved from num1 to num5.
		System.out.printf("Enter five whole numbers: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		num4 = scanner.nextInt();
		num5 = scanner.nextInt();
		scanner.close();
		
		// If statements that will determine if the numbers are positive or negative inputs
		// If they are positive then they will be added to the total positive numbers
		// Otherwise it will go be added to the total of negative numbers 
		
		if (num1 > 0) {
			posNum = posNum + num1;
			pos++;
		} else {
			nonPosNum = nonPosNum + num1;
			neg++;
		}
		if (num2 > 0) {
			posNum = posNum + num2;
			pos++;
		} else {
			nonPosNum = nonPosNum + num2;
			neg++;
		}	
		if (num3 > 0) {
			posNum = posNum + num3;
			pos++;
		} else {
			nonPosNum = nonPosNum + num3;
			neg++;
		}	
		if (num4 > 0) {
			posNum = posNum + num4;
			pos++;
		} else {
			nonPosNum = nonPosNum + num4;
			neg++;
		}	
		if (num5 > 0) {
			posNum = posNum + num5;
			pos++;
		} else {
			nonPosNum = nonPosNum + num5;
			neg++;
		}	
		
		// Calculates the sum of all the numbers
		sumNum = num1 + num2 + num3 + num4 + num5;
		
		// Calculates the average of all numbers 
		avgTotal = sumNum / 5.0;
		
		// If statements to find the averages without doing division
		if (pos > 0) {
			avgPos = (posNum * 1.0)/pos;
		} else { 
			avgPos = 0;
		}
		if (neg > 0) {
			avgNeg = (nonPosNum * 1.0)/neg;
		} else {
			avgNeg = 0;
		}
		
		// If statements that will determine the output 
		if (pos == 1 && neg > 1) {
			System.out.printf("The sum of the %d positive number: %d%n", pos, posNum);
			System.out.printf("The sum of the %d non-positive numbers: %d%n", neg, nonPosNum);
			System.out.printf("The sum of the 5 numbers: %d%n", sumNum);
			System.out.printf("The average of the %d positive number: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
		else if (pos > 1 && neg == 1) {
			System.out.printf("The sum of the %d positive numbers: %d%n", pos, posNum); 
			System.out.printf("The sum of the %d non-positive number: %d%n", neg, nonPosNum);
			System.out.printf("The sum of the 5 numbers: %d%n", sumNum);
			System.out.printf("The average of the %d positive numbers: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive number: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", pos, posNum); 
			System.out.printf("The sum of the %d non-positive numbers: %d%n", neg, nonPosNum);
			System.out.printf("The sum of the 5 numbers: %d%n", sumNum);
			System.out.printf("The average of the %d positive numbers: %.2f%n", pos, avgPos);
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", neg, avgNeg);
			System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		}
	}

}
