// Sum of two Complex Numbers

public class ComplexNumber {
	int real, imaginary;

	// constructor
	ComplexNumber(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	static ComplexNumber addComplex(ComplexNumber a, ComplexNumber b){
		ComplexNumber sum = new ComplexNumber(0, 0);
		sum.real = a.real + b.real;
		sum.imaginary = a.imaginary + b.imaginary;
		return sum;
	}

	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(12, 4);
		System.out.println("First Number : " + a.real +" + "+ a.imaginary + "i");
		
		ComplexNumber b = new ComplexNumber(5, 3);
		System.out.println("Second Number : " + b.real +" + "+ b.imaginary + "i");

		ComplexNumber c = addComplex(a, b);
		System.out.println("Sum of Numbers : " + c.real +" + "+ c.imaginary + "i");
	}
}
