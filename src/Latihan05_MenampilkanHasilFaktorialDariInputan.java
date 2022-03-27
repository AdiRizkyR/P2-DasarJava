import java.util.Scanner;

public class Latihan05_MenampilkanHasilFaktorialDariInputan {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int nilai, hasil, faktorial = 1;

        System.out.print("Masukan Bilangan Faktorial : ");
        nilai = input.nextInt();

        for (hasil = 1; hasil <= nilai; hasil++){
            faktorial = faktorial * hasil;
        }
        System.out.println("Nilai faktorial dari " + nilai + " adalah : " + faktorial);
    }
}
