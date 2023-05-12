public class LinearSearch {

    public static int find(int[] arr, int target){
        for(int i = 0; i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] arr, int target){
        for(int i = 0; i<arr.length;i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static int find(String str, char target){
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String str, char target){
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static int[] find(int[][] twoDArr, int target){
        for(int row=0; row<twoDArr.length;row++){
            for(int column=0; column<twoDArr[row].length; column++){
                if (twoDArr[row][column] == target)
                    return new int[] {row, column};
            }
        }
        return new int[] {-1,-1} ;
    }
}
