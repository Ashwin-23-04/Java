package algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,6,2,1,3,5,0};
        int index = linearSearch(arr, 6);
        if (index != -1){
            System.out.println("Element found at index : " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] arr, int value) {
        for (int i= 0; i< arr.length; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
