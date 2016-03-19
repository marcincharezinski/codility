package com.company.oddOccurrencesInArray;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] A = {1};

        solution(A);
    }


    public static int solution(int[] A) {

        int result = 0;
        Arrays.sort(A);

        if (A.length == 1) return A[0];
        if (A[A.length - 1] != A[A.length - 2]) {
            int i = 0;
            while (i < A.length - 1) {
                if (A[i] == A[i + 1]) {
                    i++;
                } else {
                    result = A[i];
                }
                i++;
            }

        } else {
            result = A[A.length - 1];
        }

        return result;
    }


}
