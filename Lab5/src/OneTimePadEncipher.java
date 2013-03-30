public class OneTimePadEncipher {

	public static int charToInt(char l) {
		int q = (int) l;
		int c1 = q - 65;
		return c1;
	/*	int c2 = q - 97;
	if (q >= 65 && q <= 90) return c1;
	else if(q >= 97 && q <= 122) return c2; 
*/
		// Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
	}

	public static char intToChar(int i) {
		return (char) (i+97);
		// Should convert an integer to a character, for example 0 -> 'a', b -> '1'
		// it should always return lower case char
	}

	public static boolean isAlpha(char c) {
		if (((int) c >= 65 && (int) c <= 90) || ((int) c >= 97 && (int) c <= 122)) return true;
		else return false;
		// You do not need to implement this method, but you may find it useful.
	}

	public static String encipher(String original, String onetimepad) {
		int l = original.length();
		int otpl = onetimepad.length();
		//int lb = onetimepad.length();
		int originalNum[] = new int[l];
		int onetimepadNum[] = new int[otpl];
		int enchiperNum[] = new int [l];
		String output = "";

		for (int i=0; i<l; i++){
			originalNum[i] = charToInt(original.toUpperCase().charAt(i));
		}
		for (int j=0; j<otpl; j++){
			onetimepadNum[j] = charToInt(onetimepad.toUpperCase().charAt(j));
		}

		for (int p=0; p<l; p++) {
			 
			enchiperNum[p] =(originalNum[p] + onetimepadNum[p]+26) % 26; //да смята остатъка винаги при + числа
		}
		for (int s=0; s<l; s++){
			if(enchiperNum[s]<0) output += " "; // not exactly true
			else
			output += intToChar(enchiperNum[s]);
		}
return output;
	}	


	public static void main(String[] args) {
		String ciphertext = encipher("IS THIS SECURE", "KEEPMEVERYVERYSAFE");
		System.out.print(ciphertext);
	}

}