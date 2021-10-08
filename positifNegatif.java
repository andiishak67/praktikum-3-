import java.util.Scanner;
class positifNegatif
{
public static void main(String[]args)
{
    int bilangan;
    Scanner sc=new Scanner(System.in);
    System.out.println("Masukkan bilangan : ");
    bilangan=sc.nextInt();
    if (bilangan<0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan negatif");
    }
    if (bilangan>0){
        System.out.println("bilangan " +bilangan+ " adalah bilangan positif");
    

    }
  }
}