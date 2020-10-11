import java.util.HashMap;
import java.util.Map;

public class DPEfficient {
    Map<Integer,Integer> map = new HashMap<>();

    public int fib(int n) {
        if(n <= 0) {
            return 0;
        } else if(n == 1 || n == 2) {
            return 1;
        } else if(map.containsKey(n)){
            return map.get(n);
        } else {
            int answer = fib(n - 1) + fib(n - 2);
            map.put(n, answer);
            return answer;
        }
    }
}
