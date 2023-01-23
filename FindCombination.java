package Day_06;

public class FindCombination {
	public static void main(String[] args) {
		
	
	int count= 0;
	 int[] a = {'a','b','e','g','a','g'};
	 
	 for(int i =0; i<a.length; i++) {
		 for(int j=i; j<a.length; j++) {
			 if(a[i]=='a' && a[j]=='g') {
			count++;
			 }
			
		 }
	 }
	 System.err.println(count);
	 
	}
}
