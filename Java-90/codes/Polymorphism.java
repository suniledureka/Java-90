class A{
	void display(){
		System.out.println("in class A");
	}
}

class B extends A{
	@Override
	void display(){
		System.out.println("in class B");
	}
}

class C extends A{
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();

		System.out.println("obj instance of A = " + (obj instanceof A));
		System.out.println("obj instance of B = " + (obj instanceof B));
		System.out.println("obj instance of Object = " + (obj instanceof java.lang.Object));
		System.out.println("obj instance of C = " + (obj instanceof C));
	}
}
