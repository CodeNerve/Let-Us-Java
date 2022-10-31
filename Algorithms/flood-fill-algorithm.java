// by - ajay

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
 
class Pair
{
    int x, y;
 
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
 
class Main
{
 
    private static final int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
    private static final int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
 
    public static boolean isSafe(char[][] mat, int x, int y, char target)
    {
        return x >= 0 && x < mat.length && y >= 0 && y < mat[0].length
                && mat[x][y] == target;
    }

    public static void floodfill(char[][] mat, int x, int y, char replacement)
    {
        if (mat == null || mat.length == 0) {
            return;
        }
 
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(x, y));
 
        char target = mat[x][y];
 
        if (target == replacement) {
            return;
        }
 
        while (!q.isEmpty())
        {
            Pair node = q.poll();
 
            x = node.x;
            y = node.y;
 
            mat[x][y] = replacement;
 
            for (int k = 0; k < row.length; k++)
            {
                if (isSafe(mat,x + row[k], y + col[k], target))
                {
                    q.add(new Pair(x + row[k], y + col[k]));
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        char[][] mat = {
                "YYYGGGGGGG".toCharArray(),
                "YYYYYYGXXX".toCharArray(),
                "GGGGGGGXXX".toCharArray(),
                "WWWWWGGGGX".toCharArray(),
                "WRRRRRGXXX".toCharArray(),
                "WWWRRGGXXX".toCharArray(),
                "WBWRRRRRRX".toCharArray(),
                "WBBBBRRXXX".toCharArray(),
                "WBBXBBBBXX".toCharArray(),
                "WBBXXXXXXX".toCharArray()
        };
 
        int x = 3, y = 9;   
 
        char replacement = 'C';
 
        floodfill(mat, x, y, replacement);
 
        for (char[] row: mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
