package com.company.treeHeigh;

public class Solution {

    public static void main(String[] args) {

    }


    public static int solution(Tree T) {
        if (T == null)
            return -1;
        return 1 + Math.max(solution(T.l), solution(T.r));
    }

    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
}
