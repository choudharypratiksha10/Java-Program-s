class MutableClass{
	int a;
	void add(){
		a = a + 5;
	}
}

public class MutableClassDemo{
	public static void main(String[] args){
		MutableClass m1 = new MutableClass();
		m1.a = 10;
		m1.add();
		
		System.out.println(m1.a);
	}
}