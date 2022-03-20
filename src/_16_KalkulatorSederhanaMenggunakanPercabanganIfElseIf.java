import java.util.Scanner;

public class _16_KalkulatorSederhanaMenggunakanPercabanganIfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.print("Enter the first number : ");
        double a = input.nextDouble();
        System.out.print("Enter the second number : ");
        double b = input.nextDouble();
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-multiplication");
        System.out.println("4-division");
        System.out.print("Choose one of following operations : ");
        int choice = input.nextInt();
        double result = 0.0;
        if (choice == 1){
            result = a + b;
        } else if (choice == 2){
            result = a - b;
        } else if (choice == 3){
            result = a * b;
        } else if (choice == 4){
            result = a / b;
        }
        if ((choice > 0) && (choice < 5)){
            System.out.println("result : " + result);
        } else {
            System.out.println("Invalid Choice");
        }
        System.out.println("Thank you for using our calculator");
    }
}
