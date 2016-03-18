package com.company.CyclicRotation;


import com.company.Gap.Main;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] before = {3,8,9,7,6};
        int[] after = new int[before.length];
        int K = 3;



    for(int j = 0; j<K; j++) {

        for (int i = 1; i < before.length; i++) {
            after[i] = before[i - 1];
        }
        after[0] = before[before.length - 1];

        System.out.println("after: " + Arrays.toString(after));
        
    }

    }



    public int[] solution(int[] A, int K) {





        return null;
    }
}
