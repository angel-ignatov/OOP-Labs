public class ArrayOps {

	static public double findMax(double[] data) {
		int l = data.length; 
		double max = data[0];
		for(int i=0; i<l; i++) {
			if (max <= data[i])	max = data[i];
		}
		return max;
	}

	static public double[] normalise(double data[]) {
		int l = data.length;
		double dataN[] = new double[l];
		double sum = data[0];
		for(int i=0; i<l; i++) sum += data[i];

		for(int j=0; j<l; j++) dataN[j] = data[j]/sum;

		return dataN;
	}

	static public void normaliseInPlace(double data[]) {
		// ADD CODE HERE
	}

	static public double[] reverse(double[] data) {
		int l = data.length;
		double dataR[] = new double[l];
		for (int i=0; i<l; i++) dataR[i] = data[l-1-i];
		return dataR;
	}

	static public void reverseInPlace(double[] data) {
		// ADD CODE HERE
	}

	static public void swap(double[] data1, double[] data2) {
		// ADD CODE HERE
	}
	public static void main(String args[]){
		double input[] = {1,2,3,4,5};
	    System.out.println("Max: " + findMax(input));
	    System.out.println("Normalise: " + normalise(input));
	    System.out.println("Reverse: " + reverse(input));

	}

}