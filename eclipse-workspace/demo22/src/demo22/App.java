package demo22;

public class App {

	public static void main(String[] args) {
		// byte-long float-double
		short shortNum=120;
		int intNum=shortNum;
		System.out.println("shortNum:"+shortNum);
		System.out.println("intNum:"+intNum);
		
		intNum=12345;
		shortNum=(short) intNum;
		System.out.println("shortNum:"+shortNum);
		System.out.println("intNum:"+intNum);
		
		double doubleNum=12345.6789;
		float floatNum=(float) doubleNum;
		System.out.println("floatNum="+floatNum);
		System.out.println("doubleNum="+doubleNum);
		
		floatNum=9876.54321f;
		doubleNum=floatNum;
		System.out.println("floatNum="+floatNum);
		System.out.println("doubleNum="+doubleNum);
	}

}
/*
 * byte
 * short
 * int
 * long
 * float
 * double
 *
*/