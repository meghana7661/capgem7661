package day2;
import java.util.Scanner;

public class FtoCen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


    {
        float fahr;
        double cel;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Temperature in Fahrenheit : ");
        fahr = sc.nextFloat();
		
        cel = (fahr-32) *5/9;
		
        System.out.print("Equivalent Temperature in Celsius = " + cel);sc.close();}}}