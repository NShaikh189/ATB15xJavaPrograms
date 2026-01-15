package DSA.Stack;

import java.util.Stack;

public class StackStringBalance {
    public static void main(String[] args) {
        String str = "[({3+2})]";
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()) {
            if(ch=='{' || ch =='[' || ch=='(') {
                stack.push(ch);
                System.out.println(stack);
            }

            if(ch=='}')
            {
                if(stack.pop()=='{')
                    flag=true;
                else flag=false;
            }

            else if(ch==']')
            {
                if(stack.pop()=='[')
                    flag=true;
                else flag=false;
            }

            else if(ch==')')
            {
                if(stack.pop()=='(')
                    flag=true;
                else flag=false;
            }
        }
        //System.out.println(stack);

        if(flag)
            System.out.println("Balanced");
        else System.out.println("Not balanced");
    }
}
