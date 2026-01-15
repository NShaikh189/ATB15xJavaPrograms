package DSA.Stack;

import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();

        mainStack.push(20);
        mainStack.push(5);
        mainStack.push(12);
        mainStack.push(9);

        System.out.println("Before Sort: "+mainStack);
        sortStack(mainStack);
    }

    private static void sortStack(Stack<Integer> mainStack) {
        Stack<Integer> temp = new Stack<>();

        while(!mainStack.isEmpty())
        {

            int mainTopElement = mainStack.pop();

           // if(temp.isEmpty()) ====>Not required as it is already covered in step 31
           //     temp.push(mainTopElement);
           // else
           // {
                while(!temp.isEmpty() && temp.peek()>mainTopElement) {
                    int tempTopElement = temp.pop();
                    mainStack.push(tempTopElement);
                }
                temp.push(mainTopElement);

           // }
        }
        System.out.println("Sorted Stack: "+temp);
    }
}
