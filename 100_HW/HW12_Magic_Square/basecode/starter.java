import pkg.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many special squares do you want to find");
		int n = sc.nextInt();
		
		System.out.println("The frist " + n + " special squares are: ");
		specialSquares(n);
	}
}
