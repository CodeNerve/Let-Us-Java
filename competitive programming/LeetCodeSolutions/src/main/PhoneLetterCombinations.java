import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Input: [2, 3, 4]

//Output:
//ADG BDG CDG AEG BEG CEG AFG BFG CFG ADH BDH CDH AEH BEH CEH AFH BFH CFH ADI BDI CDI AEI BEI CEI AFI BFI CFI

class PhoneDigitStrings
{
    public static Set<String> findCombinations(List<List<Character>> keypad, int[] keys)
    {
        Set<String> combinations = new HashSet<>();

        if (keypad == null || keypad.size() == 0 || keys == null || keys.length == 0) {
            return combinations;
        }

        for (char ch : keypad.get(keys[0])) {
            combinations.add(String.valueOf(ch));
        }

        for (int i = 1; i < keys.length; i++) {
            Set<String> prevList = new HashSet<>(combinations);
            combinations.clear();

            for (Character ch : keypad.get(keys[i])) {
                for (String s : prevList) {
                    combinations.add(s + ch);
                }
            }
        }

        return combinations;
    }

    public static void main(String[] args)
    {
        List<List<Character>> keypad = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList('A', 'B', 'C'),
                Arrays.asList('D', 'E', 'F'),
                Arrays.asList('G', 'H', 'I'),
                Arrays.asList('J', 'K', 'L'),
                Arrays.asList('M', 'N', 'O'),
                Arrays.asList('P', 'Q', 'R', 'S'),
                Arrays.asList('T', 'U', 'V'),
                Arrays.asList('W', 'X', 'Y', 'Z')
        );

        int[] keys = {2, 3, 4};

        Set<String> combinations = findCombinations(keypad, keys);
        System.out.println(combinations);
    }
}
