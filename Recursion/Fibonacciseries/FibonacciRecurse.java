public class Main
{
	public static void main(String[] args) {
	    int n=7;
		System.out.println(fibonacci(n));
	}
  //function to get nth fibonacci number using recursion
	static int fibonacci(int n){
	    if(n<=1){
	        return n;
	    }
	    if(n==2){
	        return 1;
	    }
	    return fibonacci(n-1)+fibonacci(n-2);
	}
}
