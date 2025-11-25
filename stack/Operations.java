import java.util.Stack;

public class Operations {
    public static void main(String[] args) {
        // stack creation
        Stack<Integer> s = new Stack<>();


        // insert elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        // remove elements

        // int popped = s.pop();
        // System.out.println("The element "+popped+" is removed");

        s.pop();
        s.pop();

        // check th etop element
        System.out.println("Top Element is : "+s.peek());  
        System.out.println(s);
    }
}


