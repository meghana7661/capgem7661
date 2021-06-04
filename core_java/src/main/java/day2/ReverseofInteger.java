package day2;

public class ReverseofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    int n= 9164, m,rev = 0;
while(n!=0)
			{
			    
			      m = n % 10;
			      rev= rev * 10 + m;
			      n=n/ 10;
			    }

			    System.out.println(rev);
			  }
			
	}


