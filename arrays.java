import java.util.*;

public class arrays {

     public static void updateMarks(int marks[]){
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = marks[i] + 1 ;
        }
    }
    
    public static void main(String[] args) {
        int marks[] = new int[100]; // empty array stores zero
        System.out.println("length of array is = " + marks.length);

        int numbers[] = { 1, 2, 3, }; // size of array is 3

        String fruits[] = { "apple", "mango", "banana" }; // size of array is 3

        // give the input to above array
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the marks of physics ::");
        marks[0] = scan.nextInt(); // phy

        System.out.println("enter the marks of chemistry ::");
        marks[1] = scan.nextInt(); // chem

        System.out.println("enter the marks of maths ::");
        marks[2] = scan.nextInt(); // maths

        System.out.println("the array is ::");
        System.out.println("phy " + marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("maths " + marks[2]);

        // updation of marks

        // marks[2] = 100;
        marks[2] = marks[2] + 1; // another techniques of updation
        System.out.println("maths " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");

        int marks[] = {45,46,47};
        
        updateMarks(marks);   //calling the function
        
        System.out.println(Arrays.toString(marks))

    }

}
