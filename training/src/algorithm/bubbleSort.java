package algorithm;


public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        sorting(arr);

        for(int x:arr){
            System.out.print(x);
        }
    }

    private static void sorting(int[] arr) {
        for (int i=0; i<arr.length-1;i++){
            for (int j=0;j< arr.length - i - 1; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
