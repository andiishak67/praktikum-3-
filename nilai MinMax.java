import javax.swing.JOptionPane;

public class Nilai_MaxMin {
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int max,min;
        int i;
        
        //membuat perulangan dari inputan user, dimana perulangan
        //akan menampilkan output untuk menginputkan angka sebanyak 10 kali
        for (i = 0; i<10; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: "+bilangan);
        }
        
        //inisialisasi variabel min dan max dengan membuat kedua variable tersebut memiliki nilai array dari angka
        min=nilai[0];
        max=nilai[0];
        //menghitung nilai max dan nilai min
        for (i=0; i<10; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);        
    }
}