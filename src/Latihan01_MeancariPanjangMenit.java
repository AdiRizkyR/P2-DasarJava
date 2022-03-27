import java.util.Scanner;

public class Latihan01_MeancariPanjangMenit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam1, jam2, menit1, menit2;

        //inputan
        System.out.print("Jam Awal : ");
        jam1 = input.nextInt();
        System.out.print("Menit Awal : ");
        menit1 = input.nextInt();
        System.out.print("Jam Akhir : ");
        jam2 = input.nextInt();
        System.out.print("Menit Akhir : ");
        menit2 = input.nextInt();

        //durasi waktu
        int durasiAwal = (jam1*60)+menit1;
        int durasiAkhir = (jam2*60)+menit2;
        int jarakdurasi = durasiAkhir - durasiAwal;

        //output
        System.out.println("Durasi waktu antara jam " + jam1 + ":" + menit1 + " dengan jam " + jam2 + ":" + menit2 + " adalah = " + jarakdurasi + " menit");
    }
}
