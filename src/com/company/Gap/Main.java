package com.company.gap;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //int N = new Random().nextInt();
        int N = 15;
        solution(N);

    }

    public static LinkedList createListOfZeros(ArrayDeque<Integer> inputStack) {
        LinkedList list = new LinkedList();
        int a = 0;
        while (inputStack.peekFirst() == 0 ) {
            inputStack.pop();
        }
        while (!inputStack.isEmpty()) {
                if (inputStack.peek() == 0) {
                    a++;
                } else {
                    list.add(a);
                    a = 0;
                }
                inputStack.pop();
            }

        return list;
    }

    public static int solution(int N) {
        ArrayDeque<Integer> arrayDeque = IntToBinaryArray(N);
        LinkedList list = createListOfZeros(arrayDeque);
        Collections.sort(list);
        if (list.getLast().equals(0))
            return 0;

        return (int) list.getLast();
    }

    public static ArrayDeque<Integer> IntToBinaryArray(int x) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int j = 0; j < Integer.SIZE; ++j) {
            stack.push(x & 0x1);
            x >>= 1;
        }
        return (ArrayDeque<Integer>) stack;
    }


}
