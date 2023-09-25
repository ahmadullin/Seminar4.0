package org.example;

import org.example.BinaryTree;

public class Main {
    public static void main(String[] args) {

//        HashMap map = new HashMap();
//
//        map.insert(1, 2);
//        map.insert(3, 4);
//        map.insert(17, 6);

        BinaryTree tree = new BinaryTree();

//        tree.insert(5);
//        tree.insert(3);
//        tree.insert(4);
//        tree.insert(1);
//        tree.insert(2);
//        tree.insert(7);
//        tree.insert(8);
//        tree.insert(6);
        for (int i = 1; i <= 8; i++) {
            if (i != 2)
                tree.insert(i);
        }
        int stop =0;

//        System.out.println(tree.find(7));
//        System.out.println(tree.find(9));


    }
}