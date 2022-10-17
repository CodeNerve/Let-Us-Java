import java.util.ArrayList;
import java.util.List;

public class string_binary_converter {

        public static void main(String[] args) {

            String input = "Example";
            String result = convertStringToBinary(input);

            System.out.println(result);

            // print the binary code
            System.out.println("Printing input Text in Binary code (Byte-wise):");
            System.out.println(utilityBinary(result, 8, " "));

        }

        public static String convertStringToBinary(String input) {

            StringBuilder result = new StringBuilder();
            char[] chars = input.toCharArray();
            for (char aChar : chars) {
                result.append(
                        String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto cast
                                .replaceAll(" ", "0")                        // zero pads
                );
            }
            return result.toString();
        }

        public static String utilityBinary(String binary, int blockSize, String separator) {

            List<String> result = new ArrayList<>();
            int index = 0;
            while (index < binary.length()) {
                result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
                index += blockSize;
            }

            return String.join(separator, result);
        }
}
