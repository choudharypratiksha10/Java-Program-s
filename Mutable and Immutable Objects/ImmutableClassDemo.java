class ImmutableClass{
	int a;
	int add(){
		return (a + 5);
	}
}

public class ImmutableClassDemo{
	public static void main(String[] args){
		ImmutableClass m1 = new ImmutableClass();
		m1.a = 10;
		int ans = m1.add();
		
		System.out.println("A in m1 = " + m1.a);
		System.out.println("Returned = " + ans);
	}
}