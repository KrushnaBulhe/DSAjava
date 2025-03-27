public class logicalopr {
    public static void main(String[] args) {
        System.out.println((5 > 2) && (6 > 3)); // &&-this is logical and , if any of statement is false then it returns
                                                // false else returns true

        System.out.println((5 < 2) && (6 > 3)); // reurns false

        System.out.println((5 < 2) || (6 > 3)); // logical or returns true
        System.out.println((5 < 2) || (6 < 3)); // returns false

        System.out.println(!(5 < 2)); // returns true
        System.out.println(!(5 > 2));
    }

}
