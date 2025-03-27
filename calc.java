import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number ::");
        int a = scan.nextInt();
        System.out.println("enter the second number ::");
        int b = scan.nextInt();
        System.out.println("enter the operator for operation ::");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("wrong operator");
        }

    }

}
