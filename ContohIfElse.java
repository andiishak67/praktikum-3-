public class ContohIfElse{
  public static void main (String[] args){
  	char hurufAwal = 'a';
  	System.out.print ("masukkan huruf awal nama anda: ");
  	try{
  	hurufAwal=(char)System.in.read();
  	}catch (Exception e){
  	System.out.println ("salah menginput ko cess:...! ");
    }
    if (hurufAwal == 'a' )
    System.out.println("apa nama mu amin. ?");
   else if (hurufAwal == 'b')
    System.out.println("apa nama mu burhan. ?");
   else if (hurufAwal == 'c')
    System.out.println("apa nama mu cecep. ?");
   else if (hurufAwal == 'd')
    System.out.println("apa nama mu daud. ?");
   else if (hurufAwal == 'e')
    System.out.println("apa nama mu endang. ?");
   else
    System.out.println("aku tidak nisa menebak");

  	
  }
  	
}
