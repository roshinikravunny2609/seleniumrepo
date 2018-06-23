package test_Java;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*calculator calci= new calculator();
calci.add(2, 2);*/
		//Calci1 cal = new Calci1();
		Calci2 cal = new Calci2();
		int a = cal.add(4, 2);
		int b = cal.sub(a, 5);
		int c = cal.mul(b, 8);
		int d = cal.div(c, 5);
		cal.mod(d, 2);
	}

}
