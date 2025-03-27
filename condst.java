public class condst {
    public static void main(String[] args) {

        int age = 16;
        if (age > 18) {
            System.out.println("adult");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("not adult , not teenager");
        }

        int A = 1, B = 3;
        if (A > B) {
            System.out.println(A + " is greater than " + B);
        } else {
            System.out.println(B + " is greater than " + A);
        }

    }

}
