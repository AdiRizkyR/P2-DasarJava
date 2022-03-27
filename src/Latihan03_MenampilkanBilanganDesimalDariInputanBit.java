import java.util.Scanner;

public class Latihan03_MenampilkanBilanganDesimalDariInputanBit {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Masukan Bilangan Biner : ");
        String binaryString =input.nextLine();
        System.out.println("Desimal : " + Integer.parseInt(binaryString,2));
    }
}
