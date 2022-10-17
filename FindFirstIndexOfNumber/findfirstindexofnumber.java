import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(findIndex.firstIndex(input, x));
	}
}


class findIndex {
public static int firstIndex(int input[], int x, int startIndex) {
if(startIndex == input.length) {
return -1;
}
if(input[startIndex] == x) {
return startIndex;
}
return firstIndex(input, x, startIndex + 1);
}
public static int firstIndex(int input[], int x) {
return firstIndex(input, x, 0);
}
}
