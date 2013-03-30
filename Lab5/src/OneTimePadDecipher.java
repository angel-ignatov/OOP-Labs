
public class OneTimePadDecipher {

	public static String decipher(String encipheredText, String onetimepad) {
		
		int l = encipheredText.length();
		int otpl = onetimepad.length();
		String encipheredTextLow = encipheredText.toLowerCase();
		String onetimepadUp = onetimepad.toUpperCase();
		int encipheredTextNum[] = new int[l];
		int onetimepadNum[] = new int[otpl];
		int dechiperNum[] = new int[l];
		String original = "";
		for(int i=0; i<l; i++)
			encipheredTextNum[i] = OneTimePadEncipher.charToInt(encipheredTextLow.charAt(i))-97;
		///create an array with the corresponding 0-25 indeces
		for (int j=0; j<otpl; j++)
			onetimepadNum[j] = OneTimePadEncipher.charToInt(onetimepadUp.charAt(j))-65;
		///create an array with the corresponding 0-25 indeces
		
		for (int p=0; p<l; p++)
		dechiperNum[p] = (encipheredTextNum[p] - onetimepadNum[p] + 26)%26;
		//decode in numbers
		
		for (int q=0; q<l; q++)
			if(dechiperNum[q]<0) original += " "; // not exactly true
			else
			original += OneTimePadEncipher.intToChar(dechiperNum[q]-32);
		
		return original;
	}
	
	public static void main(String[] args) {
		String ciphertext = decipher("uvufsghktdal", "WHATSTHEPASSWORD");
		//System.out.print("YOUMANAGEDIT".equals(OneTimePadDecipher.decipher("UVUFSGHKTDAL", "WHATSTHEPASSWORD")) );
		System.out.print(ciphertext);
		
	} 

}
