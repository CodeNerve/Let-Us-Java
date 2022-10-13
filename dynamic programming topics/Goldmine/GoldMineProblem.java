// Java program to solve Gold Mine problem
class GoldMineProblem {
static int collectGold(int[][] gold, int x, int y,
						int n, int m)
{

	// Base condition.
	if ((x < 0) || (x == n) || (y == m)) {
	return 0;
	}

	// Right upper diagonal
	int rightUpperDiagonal
	= collectGold(gold, x - 1, y + 1, n, m);

	// right
	int right = collectGold(gold, x, y + 1, n, m);

	// Lower right diagonal
	int rightLowerDiagonal
	= collectGold(gold, x + 1, y + 1, n, m);

	// Return the maximum and store the value
	return gold[x][y]
	+ Math.max(Math.max(rightUpperDiagonal,
						rightLowerDiagonal),
				right);
}

static int getMaxGold(int[][] gold, int n, int m)
{
	int maxGold = 0;

	for (int i = 0; i < n; i++) {

	// Recursive function call for ith row.
	int goldCollected
		= collectGold(gold, i, 0, n, m);
	maxGold = Math.max(maxGold, goldCollected);
	}

	return maxGold;
}
public static void main(String[] args)
{
	int[][] gold = { { 1, 3, 1, 5 },
					{ 2, 2, 4, 1 },
					{ 5, 0, 2, 3 },
					{ 0, 6, 1, 2 } };
	int m = 4, n = 4;
	System.out.println(getMaxGold(gold, n, m));
}
}

