
public class NbyN {

	public static int[][] nbyn(int N){
		int matrix[][] = new int[N][N];
		for (int i=0; i<N; i++){
			for (int j=0; j<N; j++){
				matrix[i][i] = i;
			}
		}
		for (int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}

		return matrix;
	}

	public static void main(String[] args) {
		System.out.println("Enter a positive integer: ");
		int N = StdIn.readInt();
		nbyn(N);

	}

}


