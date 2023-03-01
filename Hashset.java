
import java.util.HashSet;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SHYAM K
 */
public class Hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<String> obj= new HashSet(); // creation of hashset 1
        obj.add("hello");       //adding elements
        obj.add("everyone");
        obj.add("shyam");
        obj.add("sathish");
        obj.add("rishi");
        obj.add("sangeeeth");
        obj.add("rishi");
        Iterator<String> i=obj.iterator(); // creation of iterator
        System.out.println(obj);
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
        obj.remove("sathish"); //removing element
        System.out.print(obj);  //printing hashset after removing
        System.out.println();
        HashSet<Integer> obj1=new HashSet(); //creation of hashset 2
        obj1.add(10);  // adding elements
        obj1.add(45);
        obj1.add(35);
        Iterator<Integer> i1=obj1.iterator();
        System.out.println(obj1);
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println(obj1.contains(35)); //contains function
        System.out.println(obj1.contains(65));

        obj1.clear(); // deleting the whole hashset 2
        System.out.println(obj1); // returns empty set []
        System.out.println(obj.size()); // print no.of elements in obj hashset

        HashSet<String> obj2=new HashSet();
        obj2.add("seeni");
        obj2.add("suganth");
        obj2.add("prabhu");
        obj.addAll(obj2);  // add the elements of obj and obj2 hashset
        System.out.println(obj);
        obj.removeAll(obj2);   //Remove all the elements in obj which are present in obj2
        System.out.println(obj);

    }
    
}
