
public class CoordinateConverter {

	public static double convertXYtoR(double x, double y) {
		double r = Math.sqrt(x*x+y*y);
		return r;
    }

    public static double convertXYtoT(double x, double y) {
    	double t = Math.atan2(y, x);
    	return t;
    }

    public static double convertRTtoX(double r, double theta) {
       double x = r*Math.cos(theta);
       return x;
    }

    public static double convertRTtoY(double r, double theta) {
        double y = r*Math.sin(theta);
        return y;
    }

    public static double convertDegToRad(double deg) {
        double rad = deg*Math.PI/180;
        return rad;
    }

    public static double convertRadToDeg(double rad) {
        double deg = 180*rad/Math.PI;
        return deg;
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
