public class Factorial{
    public int factorial(int n){
        return n<= 1 ? 1: n * this.factorial (n-1);
    }
}