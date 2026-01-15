package DSA.Stack;

import java.util.Stack;

public class StackConcept {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.insertElementAt(90,4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
