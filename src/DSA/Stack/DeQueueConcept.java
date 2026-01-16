package DSA.Stack;

import java.util.ArrayDeque;

public class DeQueueConcept {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(3);
        arrayDeque.add(40);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.add(50);
        System.out.println(arrayDeque);
        arrayDeque.remove();
        System.out.println(arrayDeque);
        arrayDeque.removeLast();
        System.out.println(arrayDeque);
    }
}
