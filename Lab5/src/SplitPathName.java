
public class SplitPathName {
	public static String[] splitPath(String s){
		String components[] = new String[4];
		if (s.lastIndexOf('/')!=-1)
			{
			components[0] = s.substring(0,s.lastIndexOf('/')+1);
		components[1] = s.substring(s.lastIndexOf('/')+1);
			}
		else {
			components[0] = "";
			components[1] = s;
		}
		if(components[1].indexOf('.') != -1) { 
		components[2] = components[1].substring(0, components[1].indexOf('.'));
		components[3] = components[1].substring(components[1].indexOf('.'));
		}
		
		else {
			
			components[3] = "";
			components[2] = components[1];
		}
	for (int j=0; j<4; j++) 
		System.out.println(components[j]);
	return components;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a pathname: ");
		String s  = StdIn.readString();
		
		splitPath(s);

	}

}
