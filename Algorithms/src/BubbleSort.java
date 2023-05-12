public class BubbleSort {
    public static void sort(int[] arr){
        for (int i = 1; i< arr.length;i++){
            boolean swapped = false;
            for (int j = 0; j<arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
