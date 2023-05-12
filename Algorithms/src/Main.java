import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Linear Search
        linearSearchExample();
        // Binary Search
        binarySearchExample();
        // Selection Sort
        selectionSortExample();
        // Bubble Sort
        bubbleSortExample();
        // Insertion Sort
        insertionSortExample();
        // Merge Sort
        mergeSortExample();
        // Quick Sort
        quickSortExample();
        // Binary Tree
        binaryTreeExample();
        // Binary Search Tree
        binarySearchTreeExample();
    }

    public static void binarySearchTreeExample(){
        System.out.println("Binary Search Tree :-");
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(70);
        bst.insert(10);
        bst.insert(25);
        bst.insert(60);
        bst.insert(90);
        System.out.println("In Order");
        bst.inOrder(bst.root);
        System.out.println();
    }

    public static void binaryTreeExample(){
        System.out.println("Binary Tree :-");
        BinaryTree tree = new BinaryTree(10);
        tree.insertLeft(tree.root, 5);
        tree.insertRight(tree.root, 15);
        tree.insertLeft(tree.root.left, 3);
        tree.insertRight(tree.root.left, 8);
        tree.insertLeft(tree.root.right, 12);

        System.out.println("Pre order :-");
        BinaryTree.preOrder(tree.root);
        System.out.println();
        System.out.println("In Order :-");
        BinaryTree.inOrder(tree.root);
        System.out.println();
        System.out.println("Post Order :-");
        BinaryTree.postOrder(tree.root);
        System.out.println();
    }
    public static void quickSortExample(){
        System.out.println("Quick Sort :-");
        int[] arr = {22,10,14,13,6,17};
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void mergeSortExample(){
        System.out.println("Merge Sort :-");
        int[] arr = {22,10,14,13,6,17};
        arr = MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void insertionSortExample(){ // stable sort
        System.out.println("Insertion Sort :-");
        int[] arr = {22,10,14,13,6,17};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void bubbleSortExample(){ // stable sort
        System.out.println("Bubble Sort :-");
        int[] arr = {22,10,14,13,6,17};
//        int[] arr = {6, 10, 13, 14, 17, 22};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void selectionSortExample(){ // unstable sort
        System.out.println("Selection Sort :-");
        int[] arr = {10,5,26,3,15,22};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void binarySearchExample(){
        System.out.println("Binary Search :-");
        int[] arr = {1,2,3,4,5,6,7,8,9}; // sorted array
//        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(BinarySearch.search(arr,6));
        System.out.println();
    }

    public static void linearSearchExample(){
        System.out.println("Linear Search :-");
        // array of integers
        int[] arr = {1,2,3,4,5,6,7,9,8};

        System.out.println(LinearSearch.find(arr,7));
        System.out.println(LinearSearch.contains(arr,7));

        // string
        String name = "Ashwin";
        System.out.println(LinearSearch.find(name,'i'));
        System.out.println(LinearSearch.contains(name,'i'));

        // two-dimentional array
        int[][] twoDArr = {
                {2,5,7},{3,4,6},{8,3,2}
        };
        int[] result = LinearSearch.find(twoDArr, 22);
        System.out.println(Arrays.toString(result));
        System.out.println();
    }


}