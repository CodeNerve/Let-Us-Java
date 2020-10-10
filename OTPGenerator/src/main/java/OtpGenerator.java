import org.apache.commons.lang.RandomStringUtils;
import java.util.Random;

public class OtpGenerator {

    public static void main(String[] args) {

        String numbers = RandomStringUtils.randomNumeric(10);

        Random rand = new Random();
        int length = 6;

        char[] otp = new char[length];

        for (int i = 0; i < length; i++) {

            otp[i] = numbers.charAt(rand.nextInt(numbers.length()));

        }

        System.out.println(otp);
    }
}
