public class SelectionSort {
    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for (int j=i; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
