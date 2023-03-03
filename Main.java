
// Java LinkedList


import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> ln= new LinkedList<Integer>(); //Integer LinkedList Creation
        ln.add(10);  //Adding elements
        ln.add(20);
        ln.add(30);
        ln.add(40);
        ln.add(50);
        ln.add(60);
        ln.add(70);
        Iterator<Integer> i1=ln.iterator(); // Creation of Iterator
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        ln.remove(4);
        System.out.println(ln);
        LinkedList<String> str =new LinkedList<String>();  //String LinkedList Creation
        str.add("IT");  //Adding elements
        str.add("CSE");
        str.add("EEE");
        str.add("MECH");
        str.add("ECE");
        str.add("AML");
        str.add(2,"CHEM");  //Adding elements to specific index
        System.out.println(str);
        Iterator<String> i2=str.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        LinkedList<Integer> k=new LinkedList<Integer>();
        k.add(100);
        k.add(110);
        k.add(120);
        k.add(130);
        k.add(140);
        System.out.print(k);
        System.out.println();
        ln.addAll(k);  //Adding two LinkedList
        System.out.print(ln);
        System.out.println();
        ln.addFirst(55); //Adding elements to first index
        ln.addLast(66);  //Adding elements to Last index
        System.out.print(ln);
        System.out.println();
        System.out.println(ln.size());
    }
}
