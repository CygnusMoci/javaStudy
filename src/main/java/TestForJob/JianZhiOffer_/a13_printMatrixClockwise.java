package TestForJob.JianZhiOffer_;

import java.util.ArrayList;

/**
 * @author moci
 * @create 2018-02-06 9:26 AM
 **/
public class a13_printMatrixClockwise {

    public static void main(String[] args) {
        int[][] array = new int[1][2];
        int num =1;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=num;
                num++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }

        double sta = System.currentTimeMillis();
        System.out.println(new Solution().printMatrix(array));
        double end = System.currentTimeMillis();
        System.out.println((end-sta)+"ms");
    }
    public static class Solution {
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int row=matrix.length;
            int col=matrix[0].length;
            if(matrix==null||(row==0&&col==0))
                return result;
            int left=0;
            int right=col-1;
            int top=0;
            int bottom=row-1;
            while(left<=right&&top<=bottom)
            {
                for(int i=left;i<=right;i++)
                    result.add(matrix[top][i]);
                for(int i=top+1;i<=bottom;i++)
                    result.add(matrix[i][right]);
                if(bottom!=top&&right!=left)
                {
                    for(int i=right-1;i>=left;i--)
                        result.add(matrix[bottom][i]);
                    for(int i=bottom-1;i>top;i--)
                        result.add(matrix[i][left]);
                }
                left++;
                right--;
                top++;
                bottom--;
            }
            return result;
        }
    }
}
