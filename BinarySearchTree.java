package binarysearchtree;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class Tree {

    public Node create(int data) {
        Node a = new Node(data);
        a.left = null;
        a.right = null;
        return a;
    }

    public Node add(Node temp, int data) {
        if (temp == null) {
            temp = create(data);
        } else if (data < temp.data) {
            temp.left = add(temp.left, data);
        } else if (data > temp.data) {
            temp.right = add(temp.right, data);
        }
        return temp;
    }

    public void PostOrder(Node temp) {
        if (temp == null) {
            return;
        }
        PostOrder(temp.left);
        PostOrder(temp.right);
        System.out.println(temp.data);
    }

    public void inorder(Node temp) {
        if (temp == null) {
            return;
        }
        inorder(temp.left);
        System.out.println(temp.data + ",");
        inorder(temp.right);

    }

    public Node delete(Node temp, int data) {
        if (temp == null) {
            return null;
        }
        if (data < temp.data) {
            temp.left = delete(temp.left, data);
        } else if (data > temp.data) {
            temp.right = delete(temp.right, data);
        } else {
            if (temp.left == null || temp.right == null) {
                temp = null;
            } else if (temp.left != null || temp.right != null) {
                if (temp.right == null) {
                    Node p =temp.right;
                    temp = temp.left;
                    temp.right=p;
                   
                } else if (temp.left == null) {
                    Node p =temp.left;
                    temp = temp.right;
                    temp.left=p;
               

                }
                
                

            }
        }
        return temp;
    }

    public Node Search(Node temp, int data) {
        if (temp == null) {
            return null;
        }
        if (data == temp.data) {
            System.out.println("FOUND " + temp.data);
        } else if (data < temp.data) {
            Search(temp.left, data);

        } else if (data > temp.data) {
            Search(temp.right, data);
        }

        return temp;
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = null;
        root = t.add(root, 8);
        root = t.add(root, 3);
        root = t.add(root, 6);
        root = t.add(root, 10);
        root = t.add(root, 4);
        root = t.add(root, 7);
        root = t.add(root, 1);
        root = t.add(root, 14);
        root = t.add(root, 13);
        t.inorder(root);

        System.out.println("Child");
        t.delete(root, 10);
        t.inorder(root);

    }

}
