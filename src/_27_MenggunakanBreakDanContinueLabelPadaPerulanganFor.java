public class _27_MenggunakanBreakDanContinueLabelPadaPerulanganFor {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Contoh Break Label");
        Mulai:
        for (a = 0; a < 2; a++){
            for (b = 0; b < 3; b++){
                if (b == 1){
                    break Mulai;
                }
                System.out.println("a = " + a + "; b = " + b);
            }
        }
        System.out.println("\nContoh continue Label");
        Lanjut:
        for (a = 0; a < 2; a++){
            for (b = 0; b < 3; b++){
                if (b == 1){
                    break Lanjut;
                }
                System.out.println("a = " + a + "; b = " + b);
            }
        }
    }
}
