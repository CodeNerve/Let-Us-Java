public class largest_parameter_triangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) 
            if (A[i-2] + A[i-1] > A[i]) return A[i-2] + A[i-1] + A[i];
        return 0;
    }
}
