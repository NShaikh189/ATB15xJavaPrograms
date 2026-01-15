package DSA.Stack;

import java.util.Stack;

public class StackMinElement {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();


    public static void main(String[] args) {
    
        customPush(12);
        customPush(6);
        customPop();
        customPush(20);
        customPush(5);
        customPush(17);
        customPush(3);
        System.out.println("Minimum Element: "+temp.peek());

    }

    private static void customPush(int i) {

        mainStack.push(i);
        if(temp.empty())
            temp.push(i);
        else if(i<temp.peek())
            temp.push(i);
    }

    private static void customPop()
    {
       int topElement = mainStack.peek();

       mainStack.pop();
       if(temp.peek()==topElement)
           temp.pop();
    }
}
