import java.util.Scanner;

public class _17_MenggunakanSwitchCase {
    public static void main(String[] args) {
        //Membuat Variable Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //Mengambil Input
        System.out.print("inputkan Nama Warna : ");
        lampu = scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("Lampu Merah, Berhenti!!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah");
        }
    }
}
