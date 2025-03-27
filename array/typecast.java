public class typecast {
    public static void main(String[] args) {
        float a = 25.999f;
        int b = (int) a;
        System.out.println(b);

        float marks = 98.99f;
        int marks2 = (int) marks;
        System.out.println(marks2);

        char ch = 'a';
        int number1 = ch;
        char ch2 = 'b'; // 'c' 'd' 'e' o/p :: 99,100,101
        int number2 = ch2;
        System.out.println(number1);
        System.out.println(number2);

    }

}
