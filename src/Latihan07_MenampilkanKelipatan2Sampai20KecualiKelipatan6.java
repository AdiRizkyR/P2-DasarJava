import java.io.*;

public class Latihan07_MenampilkanKelipatan2Sampai20KecualiKelipatan6 {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        System.out.print("");
        while(x<20){
            if (i%3==0)
                i++;
            x = 2 * i;
            System.out.print(" "+ x +", ");
            i++;}
        System.out.println(" ");
    }
}
