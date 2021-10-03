import java.util.Scanner;
 
public class matrix_multiplication{  
  public static void main(String args[]){  
 
    int r1, c1, r2, c2;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of rows in first matrix:");
    r1 = s.nextInt();
    System.out.print("Enter number of columns in first matrix:");
    c1 = s.nextInt();
    System.out.print("Enter number of rows in second matrix:");
    r2 = s.nextInt();
    System.out.print("Enter number of columns in second matrix:");
    c2 = s.nextInt();
 
    if (col1 != r2) {
        System.out.println("Matrix multiplication is not possible");
    }
    else {
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c2];
 
        System.out.println("Enter values for matrix A : \n");
        for (int i=0; i<r1;i++) {
            for (int j = 0; j < c1; j++) 
                a[i][j] = s.nextInt();
        }
        System.out.println("Enter values for matrix B : \n");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) 
                b[i][j] = s.nextInt();
        }
 
        System.out.println("Matrix multiplication is : \n");
        for(int i = 0; i < r1; i++) {    
            for(int j = 0; j < c2; j++){    
              c[i][j]=0;      
              for(int k = 0; k < c1; k++){      
                c[i][j] += a[i][k] * b[k][j];      
              }
              System.out.print(c[i][j] + " ");  
            }
            System.out.println();
        }    
    }
  }
}
