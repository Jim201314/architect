package com.laobaozi.data.structure.tree;

/**
 * 二叉树 : 每个节点最多有两个叶子节点
 * 完全二叉树：叶节点只能出现在最下层和次下层，并且最下面一层的结点都集中在该层最左边的若干位置的二叉树。
 * @author jim
 * @date 2018/7/13
 */
public class BinaryTree {


    /**
     * 创建一个树的节点
     * 每个node存放两个数据
     * 一个左node引用和一个右node引用
     */

    class Node {
        public int iData;
        public double dData;
        public Node leftNode;
        public Node rightNode;

        /**
         * 显示树节点信息
         */
        public void showNode() {
            System.out.println("{ " + iData + "," + dData + " }");
        }
    }

    private Node root;

    /**
     * 插入Node
     * 插入之前需要判断是否为null
     * 为null需要比较大小直到currentNode为null就插入
     *
     * @param iData
     * @param dData
     */
    public void insert(int iData, double dData) {
        //创建node节点
        Node newNode = new Node();
        newNode.iData = iData;
        newNode.dData = dData;
        //判断root node是否为null
        if (root == null) {
            root = newNode;
        }
        //不为null
        else {
            Node current = root;
            Node parent;
            while (true) {
                //保存当current变为null之前的那一个父节点
                parent = current;
                //插入左节点
                if (iData < current.iData) {
                    current = current.leftNode;
                    //不断向左node寻找是否为null
                    if (current == null) {
                        parent.leftNode = newNode;
                        return;
                    }

                }
                //插入右节点
                else {
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 在tree中寻找关键字
     * 返回一个Node
     * 显示这个Node
     *
     * @param key
     * @return
     */
    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (current.iData > key) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * 寻找最值
     *
     * @return
     */
    public Node[] mVal() {
        Node minNode = null;
        Node maxNode = null;
        Node[] maxminVal = new Node[2];
        //从树的顶部开始搜索
        Node current = root;
        while (current != null) {
            minNode = current;
            current = current.leftNode;
        }
        maxminVal[0] = minNode;
        current = root;
        while (current != null) {
            maxNode = current;
            current = current.rightNode;
        }
        maxminVal[1] = maxNode;
        return maxminVal;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3, 3.666);
        tree.insert(1, 1.111);
        tree.insert(2, 2.362);
        tree.insert(4, 4.672);
        tree.insert(5, 5.865);
        tree.insert(6, 6.681);
        Node node = tree.find(6);
        if (node == null) {
            System.out.println("we can not find it");
        } else {
            node.showNode();
        }
        //查找tree中的最值
        Node[] temp = tree.mVal();
        temp[0].showNode();
        temp[1].showNode();
    }


}
