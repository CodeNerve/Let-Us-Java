
public class BinarySearch2D {
     public static boolean searchMatrix(int[][] matrix, int target) {

          int row = matrix.length;
          int col = matrix[0].length;

          int begin = 0;
          int last = row * col - 1;
          int middle = begin + (last - begin) / 2;

          while (begin <= last) {
               int element = matrix[middle / col][middle % col];

               if (element == target) {
                    return true;
               }

               else if (element < target) {
                    begin = middle + 1;
               }

               else {
                    last = middle - 1;
               }

               middle = begin + (last - begin) / 2;

          }
          return false;

     }

     public static void main(String[] args) {

          int[][] arr = { { 1, 3, 5 }, { 10, 11, 16 }, { 24, 36, 37 } };

          System.out.println(searchMatrix(arr, 11));
     }
}