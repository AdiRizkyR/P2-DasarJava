import java.util.Scanner;

public class Latihan02_MenampilkanSusunanNilaiBitDariBilanganDesimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Konversi Bilangan Desimal Ke Bit");

        //variable
        System.out.print("Masukkan Bilangan Desimal : ");
        int bilDesimal = scan.nextInt();
        System.out.print("Susudan Bit Dari " +bilDesimal+ " Adalah ");

        //Variabel Menampung Hasil Bagi
        int sisaBagi [] = new int[32];

        //Perulangan For
        for (int i=0; i<32; i++) {
            sisaBagi [i] = bilDesimal % 2;
            bilDesimal = bilDesimal / 2;
        }

        for (int j=31; j>=0; j--) {
            System.out.print(sisaBagi[j]);
        }
    }
}
