//final class A{
class A{
	final void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	final int n = 20; //instance variable
	public static void main(String[] args) 
	{
		final int n = 10; //local variable
		System.out.println(n);

		//n = 10; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 22; //error: cannot assign a value to final variable n
	}
}
