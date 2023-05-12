public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left, right;
        public Node(int value ){
            this.key = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree(int value){
        root = new Node(value);
    }

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        insert(root, value);
    }
    public Node insert(Node root, int value){
        if (root == null){
            return new Node(value);
        }
        if (value < root.key){
            root.left = insert(root.left, value);
        }else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}
