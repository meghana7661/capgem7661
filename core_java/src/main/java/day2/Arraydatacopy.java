package day2;

public class Arraydatacopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a[] = { 3, 8, 3 };
        int b[] = new int[a.length];
        b = a;

      //  b[0]++;
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
