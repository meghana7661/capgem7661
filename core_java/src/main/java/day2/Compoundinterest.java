package day2;
import java.util.Scanner;
public class Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal: ");
	    double principal = sc.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = sc.nextDouble();

	    System.out.print("Enter the time: ");
	    double time = sc.nextDouble();

	    System.out.print("Enter number of times interest is compounded: ");
	    int number = sc.nextInt();

	    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

	    System.out.println("Principal: " + principal);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Number of Time interest Compounded: " + number);
	    System.out.println("Compound Interest: " + interest);

	    sc.close();
	  }}