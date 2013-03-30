public class Mode{

	public static void main(String[] args){

		int length = args.length;
		int[] count = new int[10];
		for(int i=0;i<length;i++){
			count[Integer.parseInt(args[i])] += 1;
		}
		for(int i=0;i<10;i++){
			System.out.print("["+i+"s: "+ count[i] + "]");
			for(int j = 0; j<count[i];j++){
				System.out.print(".");
			}
			System.out.print("\n");
		}
		int max = count[0];
		int mode = 0;
		for(int i = 1;i<10;i++){
			if(count[i]>max) {mode=i;max=count[i];}
		}
		System.out.println("Mode: " + mode);
	}

}
