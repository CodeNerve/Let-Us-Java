import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
    // Write your code here
    int m = matrix.size()-1;
    int n = matrix.get(0).size()-1;
    
    int minRotations = Math.min(m,n);
    
    for(int layer = 0; layer<(minRotations+1)/2; layer++){
        int[] lm = new int[2*(m-layer) + 2*(n-layer) + r];
        int i= m - layer;
        int j = n - layer;
        int check = 0;
        //int temp = matrix.get(i).get(j);
        // i=m , j=n        
        while(j>layer){
            lm[check++] = matrix.get(i).get(j);
            j--;
        }
        // i=m , j=0;
        while(i>layer){
            lm[check++] = matrix.get(i).get(j);
            i--;
        }
        //i=0,j=0
        while(j<n-layer){
            lm[check++] = matrix.get(i).get(j);
            j++;
        }
        //i=0;j=n
        while(i<m-layer){
            lm[check++] = matrix.get(i).get(j);
            i++;
        }
        int cc = 0;
        
        //System.out.println(Arrays.toString(lm));
        
        while(cc<r){
            lm[check++] = lm[cc++];
        }
        // again
        i= m - layer;
        j = n - layer;
        //int temp = matrix.get(i).get(j);
        // i=m , j=n        
        while(j>layer){
            matrix.get(i).set(j,lm[cc++]);
             j--;
        }
        // i=m , j=0;
        while(i>layer){
            matrix.get(i).set(j,lm[cc++]);
            i--;
        }
        //i=0,j=0
        while(j<n-layer){
            matrix.get(i).set(j,lm[cc++]);
            j++;
        }
        //i=0;j=n
        while(i<m-layer){
            matrix.get(i).set(j,lm[cc++]);
            i++;
        }
    }
            
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            System.out.print(matrix.get(i).get(j) + " ");
        }
        System.out.print("\n");
    }

    }

}

public class MatrixLayerRotation{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
