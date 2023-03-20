import java.util.*;
public class queue {
    public static void main(String[] args){
        Queue<String> q=new LinkedList<String>();
        System.out.println(q.isEmpty());
        q.offer("IT");
        q.offer("CSE");
        q.offer("MECH");
        q.offer("AML");
        q.offer("EEE");
        q.offer("ECE");
        System.out.println(q);
        System.out.println(q.peek()); // top element
        System.out.println(q.poll()); // removes top element
        System.out.println(q.poll());   // removes top element
        System.out.println(q.isEmpty());   //checks queue is empty
        System.out.println(q.size());   //retruns size of queue
        System.out.println(q.contains("EEE"));  //contains method(stack have search method and queue have contains method)
        System.out.print(q);

    }
}
