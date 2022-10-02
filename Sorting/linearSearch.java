public class linearSearch{
	public static void main(String args[]){
		int arr[]={5,4,3,2,1},temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){ temp = arr[j]; arr[j]=arr[j-1]; arr[j-1]=temp;}
			}
		}
		for(int i : arr){System.out.print(i+" "); }	
	}
}