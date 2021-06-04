package day2;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	        for (int i = 1; i <= 4; i++)
	        {
	            int n = 4;
	   
	            for (int j = 1; j<= n - i; j++) { System.out.print(" "); } for (int k = i; k >= 1; k--)
	            {
	                System.out.print(k);
	            }
	            for (int l = 2; l <= i; l++) { System.out.print(l); } System.out.println(); } for (int i = 3; i >= 1; i--)
	        {
	          
	        }}}
