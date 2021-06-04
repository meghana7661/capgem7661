package day2;
import java.util.*;
public class Exampleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	    System.out.println("Create profile");
	    System.out.println("enter name");
	       String name=sc.nextLine();

	      System.out.println("name is"+name);


	      
	    System.out.println("place");
	    String place=sc.nextLine();	 

	      System.out.println("Place is"+place);

	    System.out.println("DOB");
	    String DOB=sc.nextLine();

	    System.out.println("DOB is"+DOB);
	    System.out.println("1-Male & 2-Female");    
	    int day=sc.nextInt();		     
	    {
	    	
	    switch (day) {
	      case 1:
	        System.out.println("Male");
	        break;
	      case 2:
	        System.out.println("Female");
	        break;}
	//    }System.out.println("enter mobile no."); 
	//    int Mobileno=sc.nextInt();
	   	
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	int 	n=sc.nextInt();  
	//System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=10;
	//creates an array in the memory of length 10  
	int[] array = new int[10];  
	System.out.println("Enter the phone no.: ");  
	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();  
	}  
	System.out.println("Phone no is: ");  
	// accessing array elements using the for loop  
	for (int i=0; i<n; i++)   
	{  
	System.out.print(array[i]);  
	
	 //   System.out.println("mobile no. is"+Mobileno);
	 //   int date=sc.nextInt();		     

//date d2 = new Date(int year, int month, int date);
	}

}}}
