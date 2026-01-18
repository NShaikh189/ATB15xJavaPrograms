package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class DeQueueConcept {

    public static void main(String[] args) {

        //ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(3);
        arrayDeque.add(40);
        System.out.println(arrayDeque);
      //  arrayDeque.pop();
        arrayDeque.remove(); //FIFO
        System.out.println(arrayDeque);
        arrayDeque.add(50);
        System.out.println(arrayDeque);
        arrayDeque.remove(3);
        System.out.println(arrayDeque);
        arrayDeque.poll();
     //   arrayDeque.removeLast();
       System.out.println(arrayDeque);
    }
}
