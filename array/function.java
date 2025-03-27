import java.util.*;

public class function {
    public static void printhelloworld() {
        System.out.println("hello world"); // action to be performed when callling a function
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters

        int sum = num1 + num2;
        return sum;

    }

    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // System.out.println("enter the value of a::");
    // int a = scan.nextInt();
    // System.out.println("enter the value of b::");
    // int b = scan.nextInt();
    // int sum = calculateSum(a, b); // value that are passed to the functions are
    // called arguments
    // System.out.println("the sum is ::" + sum);

    // }

    public static void swap(int A, int B) {
        // swap
        int temp = A;
        A = B;
        B = temp;
        System.out.println("the value of a is :: " + A);
        System.out.println("the value of a is :: " + B);
    }

    public static int multiply(int c, int d) { // making a function for multiplication
        int product = c * d;
        return product;

    }

    // function for finding the factorial of n
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // functon for binomial coefficient
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = n_fact / (r_fact * fact_nmr);
        return bincoeff;

    }

    // function overloading
    public static int sum(int p, int q) {
        return p + q;
    }

    public static int sum(int p, int q, int r) {
        return p + q + r;
    }

    public static float sum(float p, float r) {
        return p + r;
    }

    public static void main(String[] args) {
        // int prod = multiply(5, 3); // function calling
        // System.out.println(" c * d is :: " + prod);
        // prod = multiply(10, 50); // we can call a single function many times
        // System.out.println(" c * d is :: " + prod);
        // swap(12, 40); //we can call many function in our main function
        // System.out.println(factorial(4));// function call
        // System.out.println(binCoeff(5, 2));
        // System.out.println(sum(10, 5)); //function overloading with different no of
        // parameters
        // System.out.println(sum(2, 5, 7));
        // System.out.println(sum(3.2f, 4.2f)); // function overloading with different
        // datatypes

    }

}
