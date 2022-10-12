import java.util.Scanner;

class Volume {
    double vol, a, b, c;

    // volume of cube
    void findVolume(double a) {
        System.out.println("Volume of cube = " + (a * a * a));
    }

    // volume of rectangular box
    void findVolume(double a, double b, double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    // volume of cylinder
    void findVolume(double a, double b) {
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
    }
}

class VolumeMain {
    public static void main(String args[]) {
        double a, b, c;

        // Scanner class object to read input values
        Scanner s = new Scanner(System.in);

        // object of Volume class to call methods 
        Volume obj = new Volume();

        // read sides / length,breadth / radius, height from user
        // call findVolume() with parameters
        System.out.print("Enter the side of cube : ");
        a = s.nextDouble();

        obj.findVolume(a);

        System.out.print("Enter the length, width and height of the rectangular box : ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        obj.findVolume(a, b, c);

        System.out.print("Enter the radius and height of the cylinder : ");
        a = s.nextDouble();
        b = s.nextDouble();

        obj.findVolume(a, b);
    }
}
