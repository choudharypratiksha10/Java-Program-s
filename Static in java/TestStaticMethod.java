class Student{
	int roll_no;
	String name;
	static String college = "SB Jain";
	
	static void change(){
		college = "S.B. Jain";
		//roll_no = 223;
	}

	Student(int r, String n){
		roll_no = r;
		name = n;
	}

	void display(){
		System.out.println("Roll Number = " + roll_no + " Name = " + name + " College = " + college);
	}
}

class TestStaticMethod{
	public static void main(String[] args){
		Student.change();
		Student s1 = new Student(111, "Tom");
		Student s2 = new Student(222, "Jerry");

		s1.display();
		s2.display();
	}
}
