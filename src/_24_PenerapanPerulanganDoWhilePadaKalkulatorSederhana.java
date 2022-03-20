import java.util.Scanner;

public class _24_PenerapanPerulanganDoWhilePadaKalkulatorSederhana {
    public static void main(String[] args) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To our Calculator");
        String goOn;
        do {
            System.out.print("Enter the first number : ");
            double a = Double.parseDouble(input.nextLine());
            System.out.print("Enter the second number : ");
            double b = Double.parseDouble(input.nextLine());
            System.out.println("Choose one of following operations");
            System.out.println("1-addition");
            System.out.println("2-subtraction");
            System.out.println("3-multiplication");
            System.out.println("4-division");
            System.out.print("Enter Your Choice : ");
            int choice = Integer.parseInt(input.nextLine());
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
                System.out.println("Invalid Choice");
            }
            System.out.println("Would you like to make another calculation? [yes/no] : ");
            goOn = input.nextLine();
        } while (goOn.equals("yes"));
        System.out.println("Thank you for using our calculator");
    }
}
