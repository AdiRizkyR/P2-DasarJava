public class _02_MengamatiHasilPerubahanNilaidariSuatuProsesMatematis {
    public static void main(String[] args) {
        float total = 1400;
        System.out.println("Original Investment : $" + total);
        //Increases by 40 percent the first year
        total = total + (total*.4F);
        System.out.println("After One Year : $" + total);
        //Loses $1.500 the second year
        total = total - 1500F;
        System.out.println("After two Year : $" + total);
        //Increases by 12 percent the trird year
        total = total + (total*.12F);
        System.out.println("after three years : $" + total);
    }
}
