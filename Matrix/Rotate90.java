// Java program to rotate a
// matrix by 90 degrees without extra matrix
import java.io.*;

class Rotate90 {
	static void Reverse(int i, int mat[][], int N)
	{
		int start = 0;
		int end = N - 1;

		while (start < end) {
			int temp = mat[i][start];
			mat[i][start] = mat[i][end];
			mat[i][end] = temp;
			start++;
			end--;
		}
	}

	static void rotateMatrix(int N, int mat[][])
	{ 
		for (int i = 0; i < N; i++)
			Reverse(i, mat, N);
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
	}

	static void displayMatrix(int N, int mat[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void main(String[] args)
	{
		int N = 4;

		int mat[][] = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 },
						{ 9, 10, 11, 12 },
						{ 13, 14, 15, 16 } };
		rotateMatrix(N, mat);
		displayMatrix(N, mat);
	}
}

