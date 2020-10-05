class NoMatchException extends Exception {
    public NoMatchException(String message){
        super(message);
    }
}

class IndiaAssertComparer {

    private String s;

    IndiaAssertComparer(String s) throws NoMatchException {
        this.s = s;

        if (s.equals("India")) {
            System.out.print("Matched!\n");
        } else {
            throw new NoMatchException("Not Matched!\n");
        }
    }
}

class NoMatcher {
    public static void main(String[] a) throws NoMatchException {
        IndiaAssertComparer v = new IndiaAssertComparer("America");
    }
}
