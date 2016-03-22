package com.company.findNumber;

class Solution {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int K = 3;

        System.out.println(solution(A, K));
    }


    public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])

                return false;
            System.out.println("L: " + A[i] + "+1");
            System.out.println("P: " + A[i + 1]);
        }
        return !(A[0] != 1 && A[n - 1] != K);
    }
}
