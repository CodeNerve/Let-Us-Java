import java.util.*;

public class ip_validator {
    public static void main(String[] args) {
        System.out.print("Enter an IP address(IP-v4): ");
        Scanner sc = new Scanner(System.in);

        String ipAddress = sc.nextLine();
        boolean t = validateIpAddress(ipAddress);
        if (t == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    public static boolean validateIpAddress(String ipAddress) {
        boolean b1 = false;
        StringTokenizer t = new StringTokenizer(ipAddress, ".");
        int a = Integer.parseInt(t.nextToken());
        int b = Integer.parseInt(t.nextToken());
        int c = Integer.parseInt(t.nextToken());
        int d = Integer.parseInt(t.nextToken());
        if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                && (c >= 0 && c <= 255) && (d >= 0 && d <= 255))
            b1 = true;
        return b1;
    }
}
