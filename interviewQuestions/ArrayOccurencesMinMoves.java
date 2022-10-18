import java.util.*;

public class ArrayOccurencesMinMoves {

    public static int minMoves(int[] data) {
        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (dataMap.containsKey(data[i])) {
                dataMap.put(data[i], dataMap.get(data[i]) + 1);
            } else {
                dataMap.put(data[i], 1);
            }
        }
        System.out.println(dataMap);

        Set<Map.Entry<Integer, Integer>> pairs = dataMap.entrySet();
        //  print out pairs one by one
        int minMove = 0;
        for ( Map.Entry<Integer,Integer>  pair  :  pairs){
            int key = pair.getKey();
            int value = pair.getValue();
            if(key!=value){
                if(key>value && key-value>=value){
                    minMove += value;
                } else if (key>value && key-value<value) {
                    minMove += key - value;
                } else if (key<value) {
                    minMove += value - key;
                }
            }
        }
        return minMove;
    }
    public static int[] arrayBuilder(){
        int[] array = new int[10];
        Random random = new Random();
        int min = 1, max = 6;
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(max - min) + min;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static void main(String[] args) {

        int[] array = arrayBuilder();

        System.out.println(minMoves(array));
    }
}
