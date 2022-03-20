import java.util.InputMismatchException;
import java.util.Scanner;

public class _28_PenangananEksepsiMenggunakanPernyataanTryAndCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukan Nilai (Interger) : ");
            int value = input.nextInt();
            System.out.println("hasil nilai masukan x2 = " + (value * 2));
        } catch (InputMismatchException ex){
            System.out.println("Periksa Kembali Inputan Anda");
        } finally {
            System.out.println("Terima Kasih");
        }
    }
}
