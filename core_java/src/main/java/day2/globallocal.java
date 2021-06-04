package day2;

public class globallocal {

		// TODO Auto-generated method stub
		
		  
		    int i;  
		    static int j; 
		    byte b=2;
		 short s;
		 long l;
		 float f=0;
		 double d;
		 boolean boo;
	        char ch='m';


		    public static void main(String args[])
		    {
		        int k=8;

		        System.out.println(k);

		      globallocal gl=new globallocal();
		        System.out.println(gl.i);
		       System.out.println(gl.b);
		        System.out.println(gl.s);

		        System.out.println(gl.l);

		        System.out.println(gl.f);

		        System.out.println(gl.d);

		      System.out.println(gl.ch);
		      
		    System.out.println(gl.boo);


		        System.out.println(j);

		
	}

}
