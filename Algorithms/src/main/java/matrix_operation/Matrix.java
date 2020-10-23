package matrix_operation;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

    public static double[][] zeroMatrix(int rows, int columns) {

        double[][] A = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = 0.0;
            }
        }

        return A;
    }


    public static double[][] onesMatrix(int rows, int columns) {

        double[][] A = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = 1.0;
            }
        }

        return A;
    }


    public static double[][] randomMatrix(int rows, int columns, int min, int max) {

        double[][] A = new double[rows][columns];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = new Random().nextInt(max - min + 1) + min;
            }
        }

        return A;
    }

    public static double[][] identityMatrix(int dim) {

        double[][] A = zeroMatrix(dim, dim);

        for (int i = 0; i < dim; i++)
           A[i][i] = 1.0;

        return A;
    }

    public static double[][] transposeMatrix(double[][] A) {

        double[][] B = new double[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];
            }
        }

        return B;

    }

    public static double[][] elementMatrixMultiplication(double[][] A, double b) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = b*A[i][j];
            }
        }

        return A;
    }


    public static double[][] matrixAddition(double[][] A, double[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("matrix_operation.Matrix A and matrix_operation.Matrix B must have equal dimensions.\n Returing matrix A.");
            return(A);
        }

        double[][] C = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }


    public static double[][] matrixMultiplication(double[][] A, double[][] B) {

        if (A[0].length != B.length) {
            System.out.println("matrix_operation.Matrix A number of rows must be equal to matrix_operation.Matrix B number of columns.\nReturning matrix A");
            return(A);
        }

        double[][] C;
        C = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = 0.0;
                for(int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }


    public static void main(String[] args) {

        double[][] I = identityMatrix(4);
        System.out.println("\nIdentity matrix_operation.Matrix 4x4: "+Arrays.deepToString(I));

        double[][] A = randomMatrix(4, 4, -5, 5);
        System.out.println("\nRandom matrix_operation.Matrix A: "+Arrays.deepToString(A));

        A = elementMatrixMultiplication(A, 2);
        System.out.println("\nmatrix_operation.Matrix A multiplied by 2: "+Arrays.deepToString(A));

        double[][] A_T = transposeMatrix(A);
        System.out.println("\nmatrix_operation.Matrix A Transpose: "+Arrays.deepToString(A_T));

        double[][] B = randomMatrix(4, 4, -5, 5);
        System.out.println("\nRandom matrix_operation.Matrix B: "+Arrays.deepToString(B));

        double[][] C = matrixAddition(A, B);
        System.out.println("\nA + B: "+Arrays.deepToString(C));

        double[][] D = matrixMultiplication(A, B);
        System.out.println("\nA * B: "+Arrays.deepToString(D));


    }


}
