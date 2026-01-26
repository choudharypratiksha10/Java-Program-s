class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello Java");
    }

    // public getter method
    public int getData() {
        return data;
    }

    // public method to call private msg()
    public void showMsg() {
        msg();
    }
}

public class Simple {
    public static void main(String[] args) {
        A obj = new A();

        System.out.println(obj.getData()); // correct
        obj.showMsg();                     // correct
    }
}
