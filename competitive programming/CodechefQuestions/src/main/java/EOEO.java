/*Question:
As usual, Tom and Jerry are fighting. Tom has strength TS and Jerry has strength JS. You are given TS and your task is to find the number of possible values of JS such that Jerry wins the following game.

The game consists of one or more turns. In each turn:

If both TS and JS are even, their values get divided by 2 and the game proceeds with the next turn.
If both TS and JS are odd, a tie is declared and the game ends.
If TS is even and JS is odd, Tom wins the game.
If TS is odd and JS is even, Jerry wins the game.
Find the number of possible initial values of JS such that 1≤JS≤TS, there is no tie and Jerry wins the game.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer TS.
Output
For each test case, print a single line containing one integer ― the number of values of JS such that Jerry wins the game.

Constraints
1≤T≤105
1≤TS≤1018
Subtasks
Subtask #1 (20 points): T,TS≤100
Subtask #2 (80 points): original constraints

Example Input
2
1
11
Example Output
0
5
Explanation
Example case 1: We must have JS=TS=1, but in this case, the game ends and a tie is declared in the first turn.

Example case 2: If JS∈{2,4,6,8,10}, then JS is even and TS is odd, so Jerry wins the game in the first turn. Any odd value of JS leads to a tie instead.
*/

//Solution:

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EOEO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
		    long c=0;
		    long TS=Long.parseLong(br.readLine());
		    while(TS%2==0){
		        TS=TS/2;
		    }
		    c=c+TS/2;
		    System.out.println(c);
	}
}
}
