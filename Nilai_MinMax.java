import java.util.Scanner;

public class Nilai_MinMax {
    public static void main(String[] args) {
    	
        int[] a = {
                3,
                2,
                4,
                5,
                1
               
        };
        System.out.println("mencari nilai  min  dan max ");
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>min){
                max = a[i];
            }else if(a[i]<max){
                min = a[i];
            }
        }
        System.out.println("nilai min = "+min);
        System.out.println("nilai max = "+max);
        System.out.println("=======================");
    }
}