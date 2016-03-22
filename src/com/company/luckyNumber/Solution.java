package com.company.luckyNumber;

public class Solution {
    public static void main(String[] args) {

        int[] A = {6, 42, 11, 7, 1, 42};
        int X = 7;
        int Y = 7;

        //solution(X,Y,A);
        System.out.println("Solution: " + solution(X, Y, A));


    }

    static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;

            else if (A[i] == Y)
                nY += 1;


            if (nX == nY)
                result = i;

            System.out.println("Obieg nr: " + i);
            System.out.println("Element: " + A[i]);
            System.out.println("nX: " + nX);
            System.out.println("nY: " + nY);
            System.out.println("result: " + result);
        }
        return result;
    }
}