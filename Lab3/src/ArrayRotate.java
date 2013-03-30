public class ArrayRotate {
	public static void main(String[] args) {
		//int n = args.length;
		int[] nums = new int[100];
		int[] copy = new int[100];
					for (int i = 0; i<args.length; i++)
				nums[i] = Integer.parseInt(args[i]);
		
		for (int j =0; j<nums.length - 1; j++)
			copy[j] = nums[j+1];
		copy[args.length-1] = nums[0];
		for(int i = 0; i<args.length; i++)
			System.out.print(copy[i] + " ");
		System.out.println("");

	
	}

}
