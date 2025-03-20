import java.util.*;

public class lineararraySearch {

    // for finding integer
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            } 
        }

        return -1 ;

    }

    

    // function for finding the string
    public static int searchString (String names[] , String nameKey){
        for (int i = 0 ; i<names.length ; i++){
            if(names[i].equals(nameKey)){
                return i ;
            }
        }

        return -1 ;
    }



    public static void main(String[] args) {



        int numbers[] = { 10, 20, 30, 40, 50, 60, 85, 45 };

        int key = 85;

        int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index);
        }





        String names[] = {"prasad" , "krushna" , "piyush" , "om" , "kishor"};

        String nameKey = "om" ;

        int index2 = searchString(names, nameKey);

        if(index2 == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index2);
        }



    }
}
