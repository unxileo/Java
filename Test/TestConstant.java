
public class TestConstant {

	public static void main(String[] args) {
		int  a = 17;
		final String NAME = "xi";//常量命名用大写,eg:MAX_VALUE
		
		double r = 1;
		final double PI = 3.14;
		double circle = 2*PI*r;
		double area = PI*Math.pow(r, 2);
		System.out.println("circle="+circle);
		System.out.println("area="+area);
	}

}
