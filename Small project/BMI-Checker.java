import java.util.Scanner;
class BMI_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height(in meters): ");
        float h = input.nextFloat();
        System.out.print("Enter weight(in kilograms): ");
        float w= input.nextFloat();
        
        //BMI Calculator
        float BMI=(w/(h*h));
        System.out.print("Your BMI is: "+BMI);
        
        //Result
        if(BMI<16.00){
            System.out.print("You are starving.");
        }
        else if(16.00<BMI && BMI<=16.99){
            System.out.print("You are emaciated.");
        }
        else if(17.00<BMI && BMI<=18.49){
            System.out.print("You are underweight.");
        }
        else if(18.50<BMI && BMI<=22.99){
            System.out.print("You are normal, low range.");
        }
        else if(23.00<BMI && BMI<=24.99){
            System.out.print("You are normal, high range.");
        }
        else if(25.00<BMI && BMI<=27.49){
            System.out.print("You are overweight, low range.");
        }
        else if(27.50<BMI && BMI<=29.99){
            System.out.print("You are overweight, high range.");
        }
        else if(30.00<BMI && BMI<=34.99){
            System.out.print("You are 1st degree obese.");
        }
        else if(35.00<BMI && BMI<=39.99){
            System.out.print("You are 2nd degree obese.");
        }
        else{
            System.out.print("Invalid Response received.");
        }
    }
}
