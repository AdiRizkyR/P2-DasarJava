import java.util.Scanner;

public class _18_KalkulatorSederhanaMenggunakanPercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom To our Calculator");
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
        switch (choice){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                break;
        }
        if ((choice > 0) && (choice < 5)){
            System.out.println("Result : " + result);
        } else {
            System.out.println("Invalid choice");
        }
        System.out.println("Thank You for using our calculator");
    }
}
