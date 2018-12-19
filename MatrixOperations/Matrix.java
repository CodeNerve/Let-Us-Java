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
                A[i][j] = new Random().nextInt(max + 1) - min;
            }
        }

        return A;
    }


    public static double[][] matrixAddition(double[][] A, double[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            System.out.println("Matrix A and Matrix B must have equal dimensions.\n Returing matrix A.");
            return(A);
        }

        double[][] C;
        C = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }


    public static double[][] matrixMultiplication(double[][] A, double[][] B) {

        if (A[0].length != B.length) {
            System.out.println("Matrix A number of rows is not equal to Matrix B number of columns.\nReturning matrix A");
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

        double[][] A = randomMatrix(4, 4, -5, 5);
        System.out.println("\nMatrix A: "+Arrays.deepToString(A));

        double[][] B = randomMatrix(4, 4, -5, 5);
        System.out.println("\nMatrix B: "+Arrays.deepToString(B));

        double[][] C = matrixAddition(A, B);
        System.out.println("\nA + B: "+Arrays.deepToString(C));

        double[][] D = matrixMultiplication(A, B);
        System.out.println("\nA * B: "+Arrays.deepToString(D));

    }


}
