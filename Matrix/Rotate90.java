// Java program to rotate a
// matrix by 90 degrees without extra matrix
import java.io.*;

class Rotate90 {
	static void Reverse(int i, int mat[][], int N)
	{
		int start = 0;
		int end = N - 1;

	unction matrixRotation(matrix: number[][], r: number): void {
  let left = 0, right = matrix[0].length - 1, z = 0;
  while (left < right) {
    let head: number;
    let loop = r % (((matrix.length - z * 2) * 2 + (matrix[0].length - left * 2) * 2) - 4)
    for (let i = 0; i < loop; i++) {
      for (let k = left; k < matrix.length - z; k++) {
        let tmpHead: number = k === matrix.length - z - 1 ? null : matrix[k].splice(left, 1)[0]
        if (head) matrix[k].splice(left, 0, head);
        if (k !== matrix.length - z - 1) matrix[k].splice(right, 0, matrix[k + 1].splice(right, 1)[0])
        head = tmpHead;
      }
    }
    left++;right--;z++;
  }

  for (let numbers of matrix) {
    console.log(numbers.join(' '))
  }
}
