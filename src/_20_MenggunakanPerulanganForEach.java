public class _20_MenggunakanPerulanganForEach {
    public static void main(String[] args) {
        int arrAngka[] = {10, 11, 12, 13, 14, 15};
        for (int angka : arrAngka) {
            System.out.printf("%d ", angka);
        }
        System.out.printf("\n");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars){
            System.out.println(car);
        }
    }
}
