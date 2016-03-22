package com.company.setS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class Solution {


    public static void main(String[] args) {

        int N = 4;
        System.out.println(solution(N));

    }

    public static int elOfSet(int P, int Q) {
        return (int) (pow(2, P) * pow(3, Q));
    }

    public static int solution(int N) {
        int n = 14;
        int P;
        int Q = 0;

        List<Integer> list = new ArrayList<>();
        for (P = 0; P < n; P++) {
            list.add(elOfSet(P, Q));
            for (Q = 0; Q < n; Q++) {
                list.add(elOfSet(P, Q));
            }
        }
        for (Q = 0; Q < n; Q++) {
            list.add(elOfSet(P, Q));
            for (P = 0; P < n; P++) {
                list.add(elOfSet(P, Q));
            }
        }

        List<Integer> deduped = list
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return deduped.get(N);
    }
}
