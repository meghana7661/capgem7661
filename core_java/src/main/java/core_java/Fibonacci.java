package core_java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=7, num1=0, num2=1;
System.out.println("fibonacci series of" + count+ "numbers");
for(int i=1; i<=count;++i)
{
	System.out.println(num1+" ");
	int sumofprevtwo=num1+num2;
	num1=num2;
	num2=sumofprevtwo;
}
	}

}
