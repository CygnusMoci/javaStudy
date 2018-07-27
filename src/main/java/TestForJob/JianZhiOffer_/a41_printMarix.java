package TestForJob.JianZhiOffer_;

/**
 * 旋转打印数组
 * @author moci
 * @create 2018-06-13 20:30
 **/
public class a41_printMarix {
    public static void main(String[] args) {
//        int [][] matrix = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
        int[][] matrix = {{1},{2},{3},{4},{5}};
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix){
        int tr = 0; // 左上角行数
        int tc = 0; // 左上角列数
        int dr = matrix.length-1; // 右下角行数
        int dc = matrix[0].length-1; // 右下角列数
        while (tr<=dr && tc<=dc){
            printEdge(matrix,tr++,tc++,dr--,dc--);
        }
    }

    public static void printEdge(int[][] m,int tr,int tc,int dr,int dc){
        if(tr == dr){
            for (int i = tc; i <=dc ; i++) {
                System.out.print(m[tr][i]+" ");
            }
        }else if(tc == dc){
            for (int i = tr; i <= dr; i++) {
                System.out.print(m[i][tc]+" ");
            }
        }else {
            int curC = tc;
            int curR = tr;
            while (curC!=dc){
                System.out.print(m[tr][curC]+" ");
                curC++;
            }
            while (curR!=dr){
                System.out.print(m[curR][dc]+" ");
                curR++;
            }
            while (curC!=tc){
                System.out.print(m[dr][curC]+" ");
                curC--;
            }while (curR!=tr){
                System.out.print(m[curR][tc]+" ");
                curR--;
            }
        }
    }
}
