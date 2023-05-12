public class testing {
    public static void main(String[] args) {
        int row = 4;
        int column = 10;
        String[][] m = new String[row][column];
        int a = 01;
        for (int i = 0; i < m.length; i ++){
            for (int j = 0;j < m[i].length; j++){
                m[i][j] = (a < 10 ? "0" : "") + a;
                a++;
            }
        }
        for (int i = 0; i < m.length ; i++){
            System.out.println();
            for (int j = 0 ; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
        }
    }
}
