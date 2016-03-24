package com.company.capitalDistance;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] T = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
        int i, j;
        Map<Integer, List> map = new HashMap<>();
        List list = new ArrayList<>();

        for (j = 0; j < T.length; j++) {
            int actualValue = T[j];

            for (i = 0; i < T.length; i++) {
                if (T[i] == actualValue & i != actualValue)
                    list.add(i);
            }
            map.put(actualValue, new ArrayList<>(list));
            list.clear();
        }
        System.out.println("mapa: " + map);
        int root = 1;
        List returnList = new ArrayList<>();

        for (Map.Entry<Integer, List> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List value = entry.getValue();
            // ...

            if (key == root) {
                System.out.println("Lista: " + map.get(root));
                returnList.add(map.get(root));
            }
            if () {


            }
        }
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




