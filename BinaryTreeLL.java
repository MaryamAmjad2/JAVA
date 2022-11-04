package binary.tree.ll;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }
}

class Tree {

    public Node add(int data) {
        Node a = new Node(data);
        a.left = null;
        a.right = null;
        return a;
    }

    public void inorder(Node temp) {
        if (temp == null) {
            return;
        }
        inorder(temp.left);
        System.out.println(temp.data + ",");
        inorder(temp.right);

    }

    public void postorder(Node temp) {
        if (temp == null) {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.println(temp.data + ",");
    }

    public void preOrder(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.println(temp.data);
        preOrder(temp.left);
        preOrder(temp.right);
    }
    private int max(int a ,int b){
        if(a>b){
          return a;  
        }
        else {
            return b ;
        }
    }
    public int Height(Node temp){
       if (temp==null){
            return -1 ;
        }
       return max(Height(temp.left),Height(temp.right));
       
    }
    
    
    public void LevelOrder(Node temp){
        if (temp==null){
            return ;
        }
        int height=
    }
    public int Sum(Node temp){
        
        if(temp== null){
            return 0;
        }
        return temp.data+Sum(temp.left)+Sum(temp.right);
    }
    
        public int TotalNode(Node temp){
        
        if(temp== null){
            return 0;
        }
        return 1+TotalNode(temp.left)+TotalNode(temp.right);
    }
}

public class BinaryTreeLL {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node root;
        root= t.add(1);
        root.left = t.add(5);
        root.right = t.add(6);
        root.left.left = t.add(5);
        System.out.println(  t.Height(root));
        System.out.println("InOrder");
        t.inorder(root);
        System.out.println("PostOrder");
        t.postorder(root);
        System.out.println("PreOrder");
        t.preOrder(root);
        
        System.out.println( t.Sum(root));
        System.out.println( t.TotalNode(root));
    }

}
