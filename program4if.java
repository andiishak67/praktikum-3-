import java.util.Scanner;
public class program4if
{
	public static void main (String[]args)
	{		
	 
			Scanner input = new Scanner(System.in);
		int nilai;
		
		System.out.print ("masukkan nilai =");	
		 nilai = input.nextInt();
		 
		 if(nilai==1) {
		 	System.out.println("angka yang dimasukkan adalah satu");
		 }
		 else
		  System.out.println("angka yang dimasukkan bukan satu");
		
	}
}