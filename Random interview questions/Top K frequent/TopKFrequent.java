package Random interview questions.Top K frequent;
import java.util.*;

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        ArrayList[] arr = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int index = entry.getValue();

            if(arr[index] == null){
                arr[index] = new ArrayList<>();
            }

            arr[index].add(entry.getKey());
        }

        List<Integer> list = new ArrayList<>();

        for(int i = arr.length - 1; i >= 0; i--){
            if(list.size() == k)
                break;

            if(arr[i] != null){
                list.addAll(arr[i]);
            }
        }

        return list;
    }

    public static void main(String[] args){
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        System.out.println(topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3}, 2).toString());
    }
}

