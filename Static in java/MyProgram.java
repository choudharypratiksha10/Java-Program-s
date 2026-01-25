//Non Static function
public class MyProgram{
	public static void main(String[] args){
		int a = 1, b = 2, c;
		
		MyProgram mp = new MyProgram();
		c = mp.add(a, b);
		
		System.out.println("Sum = " + c);
	}

	public int add(int i, int j){
		return i + j;
	}//normal method
}