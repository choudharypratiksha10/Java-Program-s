//Static Method
public class MyProgram1{
	public static void main(String[] args){
		int a = 1, b = 2, c;
		
		c = add(a, b);	//static method call without obj name
		
		System.out.println("Sum = " + c);
	}

	static int add(int i, int j){	//Static Method
		return i + j;
	}
}