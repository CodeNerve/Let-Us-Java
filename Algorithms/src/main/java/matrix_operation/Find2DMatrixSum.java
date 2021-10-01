package matrix_operation;

public class Find2DMatrixSum {
	
	int[][] arr;
	
	public Find2DMatrixSum(int[][] arr) {
		this.arr = arr;
	}
	
	public int findSumOfMatrix() {
		int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
		
        return sum;
	}

    public long findLongSumOfMatrix() {
		long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
		
        return sum;
	}
}
