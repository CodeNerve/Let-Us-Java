import java.util.Arrays;
import java.util.stream.Collectors;

public class binary_string_converter {

    public static void main(String[] args) {

        String input = "01000101 01111000 01100001 01101101 01110000 01101100 01100101";

        String raw = Arrays.stream(input.split(" "))
                .map(binary -> Integer.parseInt(binary, 2))
                .map(Character::toString)
                .collect(Collectors.joining());     //cut the space

        System.out.println(raw);
    }
}
