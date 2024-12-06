package GradeList;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		double[] gradeList = new double[10];
				 
				 
		for (int i = 0; i < 10; i++) {
		        System.out.print("Enter a grade between 1 and 100: ");
		        gradeList[i] = input.nextDouble();
		        	 
		     }
		
		double total = 0;
		double max = gradeList[0];
		double min = gradeList[0];
		for (double grade : gradeList) {
			total += grade;
			if(grade > max) {
				max = grade;
			}
			
			if(grade < min) {
				min = grade;
			}
		}
		double average = total / 10;
		
		System.out.println("Grade Statistics: ");
		System.out.printf("Average: %.2f%n", average);
		System.out.printf("Max: %.2f%n", max);
		System.out.printf("Min: %.2f%n", min);
				 
				 
			 
		
	}

}
