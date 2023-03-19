import java.util.*;
public class stack {
    public static void main(String args[]) {
      Stack<String> stk =new Stack<String>();
      stk.push("it");               //push method
      stk.push("cse");
      stk.push("ece");
      stk.push("mech");
      stk.push("aml");
      stk.push("chemical");
      System.out.println(stk);
      System.out.println(stk.peek());  //peek method
      stk.pop();                       //pop method
      System.out.println(stk);
      System.out.println(stk.search(("cse")));      //search method
      System.out.print(stk.size());   //size method
    }
}
