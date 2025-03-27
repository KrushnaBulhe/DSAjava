public class forloop {
    public static void main(String[] args) {

        // printing hello world 10x
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello world");
        }

        // printing the square pattern
        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * *");
        }

        // printing square pattern by using whhile loop
        int i = 1;
        while (i <= 4) {
            System.out.println("* * * *");
            i++;
        }
    }
}
