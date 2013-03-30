public class NoTriples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = new int[args.length];
		int i;

		for (i = 0; i < args.length; i++) {
			data[i] = Integer.parseInt(args[i]);
		}
		System.out.println(noTriples(data));

	}
	public static boolean noTriples(int[] nums) {
		int i;
		boolean val = true;

		for (i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
				val = false;
			}
		}
		return val;
	}
}