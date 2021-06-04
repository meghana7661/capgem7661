package day2;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		
		        Scanner sc = new Scanner(System.in);
		         
		         
		        System.out.println("How many rows you want in this pattern?");
		         
		        int rows = sc.nextInt();
		         
		        System.out.println("Here is your pattern....!!!");
		         System.out.println(0);
		        for (int i =2; i <=rows; i++) 
		        {
		            for (int j = 0; j <i; j++)
		            {
		                System.out.print(j*i);
		            }
		             
		            System.out.println();
		        }
		         
		        //Close the resources
		         
		        sc.close();
		    }
		
	}

