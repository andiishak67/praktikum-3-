import java.util.Scanner;

class prak2lat1 {
public static void main (String[] args){
Scanner input = new Scanner (System.in);
int pilihan;
boolean loop = true;

System.out.println("menu pilihan:");
System.out.println("1.nasi goreng ayam");
System.out.println("2.nasi goreng seafood");
System.out.println("3.soto ayam");
System.out.println("4.jus jeruk");
System.out.println("pilihan:");
pilihan = input.nextInt();


while(loop){
	switch (pilihan){
		   case 1:
		System.out.println("memilih nasi goreng ayam");
		loop = false;
		break;
			case 2:
		System.out.println("memilih nasi goreng seafood");
		loop = false;
		break;
			case 3:
		System.out.println("memilih soto ayam ");
		loop = false;
		break;
			case 4:
		System.out.println("memilih jus jeruk");
		loop = false;
		break;
			default:
		System.out.println("silahkan pilihan menu 1-4");
		
		
	}
}
System.out.println("pesanan anda akan diantarkan sebentar lagi");

}}