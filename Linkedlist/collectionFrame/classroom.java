import java.util.LinkedList ;  // java collection framework -> optimized with best TC

public class classroom {


    public static void main (String args[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);            //0->1->2

        //printing a LinkedList
        System.out.println(ll);


        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
    
}
