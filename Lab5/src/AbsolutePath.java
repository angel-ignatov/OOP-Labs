
public class AbsolutePath {

	public static String ensureAbsolute(String path){
		if (path.charAt(0)=='/') return path;
		else {
			String curDir = System.getProperty("user.dir");
			return curDir + "/" + path;
					}
	}
	
	public static String[] absoluteSplitPath(String s){
		String absPath = ensureAbsolute(s);
		return SplitPathName.splitPath(absPath);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a pathname: ");
		String s  = StdIn.readString();
		absoluteSplitPath(s);

	}

}
