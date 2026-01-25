class Balance{
	int accNo;
	double bal;

	Balance(){
		System.out.println("Inside Const1");
		bal = 0;
	}
	
	Balance(double b){
		System.out.println("Inside Const2");
	}

	Balance(int a, double b){
		System.out.println("Inside Const3");
		bal = b;
		accNo = a;
	}
}

class Account{
	public static void main(String[] args){
		Balance b1 =  new Balance();
		Balance b2 = new Balance(100);
		Balance b3 = new Balance(1201, 10000);

		System.out.println("Balance 1 = " + b1.bal);
		System.out.println("Balance 2 = " + b2.bal);
		System.out.println("Balance 3 = " + b3.bal + " Account Number = j" + b3.accNo);
	}
}