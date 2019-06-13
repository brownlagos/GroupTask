package exercises.fiveThree;

public class PythagoreanTriple {

	public static void main(String[] args) {
		
		System.out.printf("%s\t%s\t%s%n", "Opp","adj","hyp");
		for(int i = 1; i <= 500; i++) {
			for(int j = 1; j <= 500; j++) {
				for(int k = 1; k <= 500; k++) {
					if((i * i) + (j * j) == (k * k)) {
						System.out.printf("%d\t%d\t%d%n",i,j,k);
					}
				}
			}
		}
		

	}

}
