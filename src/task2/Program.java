package task2;

public class Program {
    public static void main(String[] args) {


        for(int i = 0; i < 10; i++) {

            if(i == 2) {
                //break;  // выход из цикла
                continue; // переход к следующей итерации
            }
            // какой-то код
        }

        /*
        1  2  3  4
        8  7  6  5
        9  10 11 12
        16 15 14 13
         */
        int[][] x = new int[4][4];
        int count = 1;
        for(int i=0;i<x.length; i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i%2 == 0) {
                    x[i][j] = count;
                } else {
                    x[i][3-j] = count;
                }
                count++;
            }
        }
        matrixPrint(x);
    }

    static void matrixPrint(int[][] y) {
        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.printf("%3d", y[i][j]);
            }
            System.out.println();
        }
    }
}
