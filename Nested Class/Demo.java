class ClassA{
	static int x = 10;
	int y = 20;
	private static int z = 30;
	
	static class ClassB{
		void get(){
			System.out.println("x: " + x);
			System.out.println("z: " + z);
		}
	}
}

class Demo{
	public static void main(String[] args){
		ClassA.ClassB ob1 = new ClassA.ClassB();
		ob1.get();
	}
}