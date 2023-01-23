package Day_06;

class Test{
	void m1() {
		System.out.println("Super class m1 method called..");
	}
}

class Test1 extends Test{
	@Override
	void m1() {
		
		System.out.println("sub class m1 method overriden by super class m1");
	}
}

public class OverrideAnnotation {
public static void main(String[] args) {
	Test test = new Test();
	
	Test1 t = new Test1();
	t.m1();
}
}
