class ClassA1{
	static int x = 10;
	int y = 20;
	public int z = 30;

	class ClassB1{
		void get(){
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			System.out.println("z: " + z);
		}
	}
}

class Demo1{
	public static void main(String[] args){
		ClassA1 ob1 = new ClassA1();
		ClassA1.ClassB1 ob2 = ob1.new ClassB1();
		ob2.get();
	}
}