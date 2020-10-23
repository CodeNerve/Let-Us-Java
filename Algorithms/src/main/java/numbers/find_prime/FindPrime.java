package numbers.find_prime;

public class FindPrime{
    public static void main(String[] args) {
        int num = 0;
        try{
            num = Integer.parseInt(args[0]);

        }catch(NumberFormatException e){
               // The first argument isn't a valid integer.  Print
            // an error message, then exit with an error code.
            System.out.println("The first argument must be an integer.");
            System.exit(1);
        }
        for(int i =2; i <=num; i++){
            int fact = 0;   
            for(int j = 1;j <=i;j++){
                    if(i%j==0){
                        fact++;
                    }
            }
            if(fact ==2){
                System.out.println(i);
            }
        }
    }    
}
