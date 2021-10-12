public class SortAlphabetically {
 //lexicographically sorts the string array
	public static void main(String[] args) {


		String[] x = { "Harry", "Hermione", "Draco", "Ginny", "Albus" };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i].compareTo(x[j]) > 0) {
					String temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(x[i]);
		}
		
	}
}
