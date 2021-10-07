import java.util.*;
import java.io.*;
import java.math.*;

public class fenwickTree {
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

	static long[] farr;

	public static long query(int l, int r) {
		return prefixsum(r) - prefixsum(l - 1);
	}

	public static long prefixsum(int idx) {
		long sum = 0;

		while (idx > 0) {
			sum += farr[idx];
			idx -= (idx & -idx);
		}

		return sum;

	}

	public static void fenwicktree(int[] arr) {
		farr = new long[arr.length];
		for (int i = 1; i < arr.length; i++) {
			update(i, arr[i]);
		}
	}

	public static void update(int idx, int delta) {

		while (idx < farr.length) {
			farr[idx] += delta;
			idx += (idx & -idx);
		}
	}

	static void solve() {
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr1 = new int[N];
        for(int i=0; i<N; i++) {
            arr1[i] = scn.nextInt();
        }
        int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = arr1[i - 1];
		}
		fenwicktree(arr);

		int Q = scn.nextInt();
		for (int i = 0; i < Q; i++) {
			String s = scn.next();
			if (s.equals("q")) {
				int l = scn.nextInt();
				int r = scn.nextInt();
				long val = query(l, r);
				sb.append(val + "\n");
			} else {
				int idx = scn.nextInt();
				int delta = scn.nextInt();
				arr[idx] += delta;
				update(idx, delta);
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