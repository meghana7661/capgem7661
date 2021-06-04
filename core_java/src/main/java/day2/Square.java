package day2;
import java.util.*;

public class Square {

	public static void main(String[] args) {
		
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Please enter a number: ");
				int num = sc.nextInt();
				System.out.println("Your squared number is: " + square(num));
				sc.close();

			}
			public static int square(int num) 
			{
				return num * num;
			}
}