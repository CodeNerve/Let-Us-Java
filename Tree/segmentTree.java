import java.util.*;
import java.io.*;
import java.math.*;

public class segmentTree {
    static StringBuilder sb;
    static long fact[];
    static int mod = (int) (1e9 + 7);

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair o) {
            return (int) (this.y - o.y);

        }
    }

    static long sgmt[];
    static long farr[];

    public static void build(int idx, int start, int end) {
        if (start == end) {
            sgmt[idx] = farr[start];
            return;
        }

        int mid = start + (end - start) / 2;
        build(2 * idx + 1, start, mid);
        build(2 * idx + 2, mid + 1, end);

        sgmt[idx] = sgmt[2 * idx + 1] + sgmt[2 * idx + 2];
    }

    public static long query(int idx, int ns, int ne, int qs, int qe) {
        if (qs > ne || qe < ns) {
            return 0;
        } else if (qs <= ns && qe >= ne) {
            return sgmt[idx];
        } else { // overlapping
            int mid = ns + (ne - ns) / 2;
            long leftSum = query(2 * idx + 1, ns, mid, qs, qe);
            long rightSum = query(2 * idx + 2, mid + 1, ne, qs, qe);

            return leftSum + rightSum;
        }
    }

    public static void update(int idx, int ns, int ne, int uidx, int delta) {
        if (ns == ne) {
            if (ns == uidx) {
                farr[uidx] += delta;
                sgmt[idx] += delta;
            }
            return;
        }

        int mid = ns + (ne - ns) / 2;
        if (uidx <= mid) {
            update(2 * idx + 1, ns, mid, uidx, delta);
        } else {
            update(2 * idx + 2, mid + 1, ne, uidx, delta);
        }

        sgmt[idx] = sgmt[2 * idx + 1] + sgmt[2 * idx + 2];
    }

    static void solve() {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        farr = new long[N];
        sgmt = new long[4 * N];
        for(int i=0; i<N; i++) {
            farr[i] = scn.nextInt();
        }
        build(0, 0, farr.length - 1);

        int Q = scn.nextInt();
        for (int i = 0; i < Q; i++) {
            String s = scn.next();
            if (s.equals("q")) {
                int l = scn.nextInt() - 1;
                int r = scn.nextInt() - 1;
                long val = query(0, 0, farr.length - 1, l, r);
                sb.append(val + "\n");
            } else {
                int idx = scn.nextInt() - 1;
                int delta = scn.nextInt();
                update(0, 0, farr.length - 1, idx, delta);
            }
        }
    }

    public static void main(String[] args) {
        sb = new StringBuilder();
        int test = 1;
        while (test-- > 0) {
            solve();
        }
        System.out.println(sb);

    }

}