import java.util.Collections;
import java.util.Objects;
import java.util.PriorityQueue;

class KthLargest {
    public static void main(String[] args) {
        int[] inputArray = {2, 1, 5, 9, 0, 35};
        int k = 2;
        Integer result = findKthLargest(inputArray, k);
        System.out.println(result);// prints 2nd largest in array = 9
    }

    public static Integer findKthLargest(int[] inputArray, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : inputArray)
            queue.add(i);
        while (k > 1) {
            queue.poll();
            k--;
        }
        return Objects.isNull(queue.peek()) ? null : queue.peek(); //returns kth largest element
    }
}