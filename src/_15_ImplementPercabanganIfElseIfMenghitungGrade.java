import java.util.Scanner;

public class _15_ImplementPercabanganIfElseIfMenghitungGrade {
    public static void main(String[] args) {
        //membuat variable dan Scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //Mengambil input
        System.out.print("Inputan nilai : ");
        nilai = scan.nextInt();

        //hitung grade
        if (nilai >= 85){
            grade = "A";
        } else if (nilai >= 75){
            grade = "B+";
        } else if (nilai >= 65){
            grade = "B";
        } else if (nilai >= 56){
            grade = "C+";
        } else if (nilai >= 55){
            grade = "C";
        } else if (nilai >= 40){
            grade = "D";
        } else {
            grade = "E";
        }

        //Cetak Hasil
        System.out.println("Grade : " + grade);
    }
}
