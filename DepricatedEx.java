package Day_06;

public class DepricatedEx {

	void m1() {
		System.out.println("Hello A..");
	}

	@Deprecated
	void m2() {
		System.out.println("Depricated method called");
	}

	void m3() {
		System.out.println("Hello C");
	}

	public static void main(String[] args) {
		DepricatedEx x = new DepricatedEx();
		
		x.m2();

	}
}
