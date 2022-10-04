class fc
{
	public static void main(String[] args) {
		
		double fahrenheit= Double.parseDouble(args[0]);
		double celsius=(fahrenheit-32)*(0.5556);
		System.out.println("Temperature in Celsius is:" +celsius);
	}
}