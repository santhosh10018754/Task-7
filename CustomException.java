package task7;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}


public class CustomException {
	 public static void validateAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Age is less than 18, not allowed.");
	        } else {
	            System.out.println("Age is valid.");
	        }
	    }
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.toString()+e.getMessage());
			
		}
		
		
	}
}

