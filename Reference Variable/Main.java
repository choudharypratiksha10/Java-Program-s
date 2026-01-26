class Demo2{
	int x = 10;
	
	int display(){
		System.out.println("x = " + x);
		return 0;
	}
}

class Main{
	public static void main(String[] args){
		Demo2 d1 = new Demo2();
	
		System.out.println(d1);
		System.out.println(d1.display());
	}
}
