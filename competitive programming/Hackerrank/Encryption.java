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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encrypt(String s) {
    // Write your code here
        String res = "";
        s = s.replaceAll("\\s","");
        int len = s.length();
        int n = 1;
        while(n*n<len){
            n++;
        }
        int m = len<=n*(n-1) ? n-1 : n;
        char[][] arr = new char[m][n];
        int c = 0;
        
        //System.out.println(m);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(c<len){
                    arr[i][j] = s.charAt(c++);
                }else
                    arr[i][j] = 0;
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( arr[i][j]);
            }
            System.out.println();
        }
        c =0;
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                if(arr[i][j]!=0){
                    res+=arr[i][j];
                }
            }
            res+=" ";
        }
        return res;
    }
}

public class Encryption{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encrypt(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
