package h3;

public class H3_main {
	public static void main(String[] args) {
		
		int[][] einheiten = new int [2][15];
		int[] zeile0 = {50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
		einheiten[0]= zeile0;
		int input = 6279;
		int z = input;
		
		for (int i = 0; i < einheiten[0].length; i++) {
			while (z / einheiten[0][i] >= 1) {
				einheiten[1][i]++;
				z = z - einheiten[0][i];
			}
		}
		
		
		for (int i = 0; i < einheiten[0].length; i++) {
			for (int j = 0; j < einheiten.length; j++) {
				System.out.print(" " + einheiten[j][i] + " |");
			}
			System.out.println();
		}
	}
}
