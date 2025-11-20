package h1;

public class H1_main {
	public static void main(String[] args) {
		
		int[] myArray = {5,6,7,10};
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + "|");
		}
		
		for (int i = 1; i <= myArray.length/2; i++) {
			int z = myArray[i-1];
			myArray[i-1] = myArray[myArray.length-i];
			myArray[myArray.length-i] = z;
			
		}
		
		System.out.println();
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + "|");
		}
		
	}
}
