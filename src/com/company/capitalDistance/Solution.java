package com.company.capitalDistance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] T = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
        int i;
        int actualValue = 1;

        Map map = new HashMap<>();
        for (i = 0; i < T.length; i++) {
            map.put(i, T[i]);
        }
        if (map.containsValue(actualValue)) {

        }
        System.out.println(map);
    }


    public static int[] solution(int[] T) {
        return null;
    }
}

class Node<T> {
    T data;
    List<Node<T>> children;

    public Node(T data) {
        this.data = data;
        this.children = new LinkedList<Node<T>>();
    }

    public Node<T> addChild(T child) {
        Node<T> childNode = new Node<T>(child);
        this.children.add(childNode);
        return childNode;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", children=" + children +
                '}';
    }
}

//    public static ArrayList path;
//    public Boolean printPath(Node root, Node dest){
//        if(root==null) return false;
//        if(root==dest||printPath(root.left,dest)||printPath(root.right,dest)){
//            //System.out.print("  " + root.data);
//            path.add(root.data);
//            return true;
//        }
//        return false;
//    }
//}

//class Node {
//    int data;
//    Node left;
//    Node right;
//    public Node (int data){
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}




