//https://codeforces.com/problemset/problem/1637/A
//BY PRATIK AGRAWAL https://github.com/PratikAgrawal02/
import java.util.*;
import java.io.*;
 
public class Main {
 
    static Scanner sc = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
 
    static boolean isSorted(int[] arr) {
        for (int i = 0;i < arr.length - 1;i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) throws IOException {
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] a = sc.nextIntArray(N);
            pw.println(!isSorted(a) ? "YES" : "NO");
        }
        pw.flush();
        pw.close();
    }
 
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }
 
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public String nextLine() throws IOException {
            return br.readLine();
        }
 
        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }
 
        public long[] nextlongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
        public Long[] nextLongArray(int n) throws IOException {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
