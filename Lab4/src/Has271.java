
public class Has271 {

	public static boolean has271(int[] nums) {
		int i;
		boolean val = false;

		for (i = 0; i < nums.length - 2; i++) {
			if ((nums[i+1] - nums[i] == 5) && (nums[i+2] - nums[i] < 2)) {
				val = true;
			}
		}
		return val;
	}
	
	public static void main(String[] args) {
		int[] data = new int[args.length];
		int i;

		for (i = 0; i < args.length; i++) {
			data[i] = Integer.parseInt(args[i]);
		}
		System.out.println(has271(data));

	}

}
