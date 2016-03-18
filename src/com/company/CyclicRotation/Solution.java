package com.company.CyclicRotation;


public class Solution {

    public static void main(String[] args) {

        int K = 3;
        int[] A = {};
        solution(A, K);

    }


    public static int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        for (int j = 0; j < K; j++) {
            int[] after = new int[A.length];

            for (int i = 1; i < A.length; i++) {
                after[i] = A[i - 1];
            }
            after[0] = A[A.length - 1];
            A = after;

        }

        return A;
    }
}
