package h2;

public class H2_main {
	public static void main(String[] args) {
		
		int n = 123456789;
		int digits = 0;
		int[] a = new int[9];
		
		String d = "" + n;		
		digits = d.length();
		
		for (int i = 1; i <= digits; i++) {
			a[a.length-i] = n % (int) Math.pow(10, i);
			if (i > 1) {
				a[a.length-i] = a[a.length-i]/ ((int) Math.pow(10, i-1));
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "|");
			
		}		
	}
}
