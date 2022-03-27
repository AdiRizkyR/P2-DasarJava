import java.io.IOException;
import java.util.Scanner;

public class Latihan04_MenentukanKelompokInputan {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        char karakter;

        System.out.println("Program menentukan kelompok inputan!!");
        System.out.print("Masukan 1 macam karakter : ");
        karakter = (char) System.in.read();

        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("Karakter " + "'" + karakter + "'" + " Adalah Huruf Besar");
        } else if (karakter >= 'a' && karakter <= 'z'){
            System.out.println("Karakter " + "'" + karakter + "'" + " Adalah Huruf Kecil");
        } else if (karakter >= 0 && karakter <= 9){
            System.out.println("Karakter " + "'" + karakter + "'" + " Adalah Angka");
        } else {
            System.out.println("Karakter " + "'" + karakter + "'" + " Adalah Karakter Khusus");
        }
    }
}
