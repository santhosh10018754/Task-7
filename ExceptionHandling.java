package task7;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  integer 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter  integer 2: ");
		int num2 = sc.nextInt();
		try {
			int res = num1/num2;
			System.out.print("Result: " +res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}


	}


