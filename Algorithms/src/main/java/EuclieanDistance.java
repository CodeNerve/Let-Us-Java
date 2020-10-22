import java.util.Scanner;
class EuclideanDistance {

    public static void main(String[] args) {
        double array[];
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Please give the dimensions");
        N = in.nextInt();

        if (N < 0) {
            try {
                throw new Exception("negative number for dimensions");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
        array = new double[N * 2];
        System.out.println("Ok! Now please give the numbers pressing enter each time");

        for (int i = 0; i < N * 2; i++) {
            array[i] = in.nextDouble();
        }

        System.out.println(euclideanDistance(array,N));
    }



    public static double euclideanDistance(double dim[], int N) {
        double sum = 0;
        double result;

        for (int i = 0; i < N; i++) {
            sum += Math.pow(dim[i + N] - dim[i], 2);
        }

        result = Math.sqrt(sum);
        return result;
    }
}
