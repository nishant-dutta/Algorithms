package org.algorithms.recursion;

public class MaxConnectedCells {


    public static void main(String[] args) {

        // Output = 3
        int[][] matrix1 ={
                {1,1,0},
                {1,0,0},
                {0,0,1}
        };

        // Output = 5
        int[][] matrix2 ={
                {1,1,0,0},
                {0,1,1,0},
                {0,0,1,0},
                {1,0,0,0}
        };

        // Output = 6
        int[][] matrix3 ={
                {0,0,0,1,1,0,0},
                {0,1,0,0,1,1,0},
                {1,1,0,1,0,0,1},
                {0,0,0,0,0,1,0},
                {1,1,0,0,0,0,0},
                {0,0,0,1,0,0,0}
        };

        System.out.println(Solution(matrix1));
        System.out.println(Solution(matrix2));
        System.out.println(Solution(matrix3));
    }

    public static int Solution(int[][] matrix){
        int maxCount = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                int count = 0;
                if(isValidCount(i,j, matrix)){
                    count = findLongestConnection(i, j, count+1, matrix);

                    if(count > maxCount)
                        maxCount = count;
                }
            }
        }
        return maxCount;
    }

    //Neighbours (i, j-1), (i, j+1), (i-1, j-1), (i-1, j),(i-1, j+1), (i+1, j-1), (i+1, j), (i+1, j+1)
    private static int findLongestConnection(int i, int j, int count, int[][] matrix) {
        if(isValidCount(i, j-1, matrix)){
            return findLongestConnection(i, j-1, count+1, matrix);
        }if(isValidCount(i, j+1, matrix)){
            return findLongestConnection(i, j+1, count+1, matrix);
        }if(isValidCount(i-1, j-1, matrix)){
            return findLongestConnection(i-1, j-1, count+1, matrix);
        }if(isValidCount(i-1, j, matrix)){
            return findLongestConnection(i-1, j, count+1, matrix);
        }if(isValidCount(i-1, j+1, matrix)){
            return findLongestConnection(i-1, j+1, count+1, matrix);
        }if(isValidCount(i+1, j-1, matrix)){
            return findLongestConnection(i+1, j-1, count+1, matrix);
        }if(isValidCount(i+1, j, matrix)){
            return findLongestConnection(i+1, j, count+1, matrix);
        }if(isValidCount(i+1, j+1, matrix )){
            return findLongestConnection(i+1, j+1, count+1, matrix);
        }else{
            return count;
        }
    }

    public static boolean isValidCount(int i, int j, int[][] matrix){
        if(i >= 0 && i < matrix.length && j >=0 && j < matrix[i].length && matrix[i][j] ==1){
            matrix[i][j]=-1;
            return true;
        }
        return false;
    }
}
