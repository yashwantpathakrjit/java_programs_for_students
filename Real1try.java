import java.util.Scanner;
class Real1
{
	public static void main(String args[])
	{ int balance=5000;
		
		
			Scanner x=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=x.nextInt();
		if(balance<amt)
		throw new ArithmeticException("insufficient balance");
		balance=balance-amt;
		System.out.println("transaction successfully completed");
		System.out.println("balance remaining=  "+balance);
	}
}

		
