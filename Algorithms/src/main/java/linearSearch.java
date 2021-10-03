public class linearSearch {

	void findElementArray(int a[],int key) {
		boolean found = false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println(key+" element found at position "+(i+1));
			  found = true;
			}
		}
	if(!found) {
		System.out.println("Element not found");
	}
	}
	
	public static void main(String args[]) {
	linearSearch ls = new linearSearch();
	int a[]= {2,1,4,5,4,-1,0};
	ls.findElementArray(a, -2);
}
}
