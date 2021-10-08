class Main
{
    // Java program to print the map of India
    public static void main(String[] args)
    {
        int a, b, c;
        String S = "Greetings from Techie Delight!!"
            + "TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQ"
            + "AIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r"
            + "\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
 
        for (b = c = 10; (b + 21 < S.length()) && (a = S.charAt(b+++21))!=0;)
            for (; a-- > 64;)
                System.out.print((char)(++c == 'Z' ? c = c / 9 : 33 ^ b & 1));
    }
}
