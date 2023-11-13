package org.algorithms.array.search;

// Multiplies two matrices by conventional method
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,5,6}};
        int[][] matrix2 = {{7,8}, {9,10}, {11,12}};
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        matrixMultiplication.printMatrix(matrixMultiplication.multiplyMatrix(matrix1, matrix2));
    }

    public void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j =0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1.length == 0 || matrix2.length == 0 || matrix1[0].length != matrix2.length) {
            System.out.println("Input is either blank or incompatible!");
            return new int[][]{{}};
        }
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i = 0 ; i < matrix1.length; i++){
            for( int j = 0 ; j < matrix1[i].length; j++){
                for(int k = 0; k < matrix2[0].length; k++){
                    resultMatrix[i][k] = resultMatrix[i][k] + matrix1[i][j] * matrix2[j][k];
                }
            }
        }

        return resultMatrix;
    }
}
