package com.company.maxSlice;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    public static void main(String[] args) {
        int[] A = {1, 0, -1, 1, 1, -1, -1};
        int S = 2;

        System.out.println(solution(A, S));

    }

    public static int sum(int[] A) {
        return IntStream.of(A).sum();
    }

    public static int solution(int[] A, int S) {
        int result = -1;

        for (int i = 0; i < A.length; i++) {
            if (sum(A) == S)
                result = A.length;
            A = Arrays.copyOf(A, A.length - 1);
        }
        return result;
    }
}