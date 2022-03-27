import java.util.Scanner;

public class Latihan06_MenampikanDeretFibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret, nilaiSebelum, nilaiSekarang, fibonacci;
        System.out.print("Masukkan Banyak Deret Fibonacci : ");
        deret = input.nextInt();
        nilaiSebelum = 1;
        nilaiSekarang = 1;
        fibonacci = 1;

        //Perulangan For
        for (int i=1; i<=deret; i++) {
            System.out.print(nilaiSekarang+ " ");
            fibonacci = nilaiSebelum + nilaiSekarang;
            nilaiSebelum = nilaiSekarang;
            nilaiSekarang = fibonacci;
        }
    }
}
