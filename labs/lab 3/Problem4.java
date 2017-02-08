
public class Problem4 {

	public static void main(String[] args) {
		//Problem 6.1
		System.out.println("The Pentagonal Numbers: ");
		for (int i = 1; i < 101; i++){
			System.out.printf("%7d ", getPentagonalNumber(i));
			if(i % 10 ==0)
				System.out.println();
		}

	}
	public static int getPentagonalNumber(int n) {
		return(n*(3 * n - 1 )) / 2;
	
	}

}
