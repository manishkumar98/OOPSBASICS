class A {
	int i;
	A(int i)	{
		System.out.println("Parent class constructor arg: " + i);
	}
}
class B extends A {
	B(int i) {
		super(i); //Parent constructor called with argument passed in child class
		System.out.println("Child class constructor");
	}
}
class Test2 {
	public static void main(String args[])	{
		B obj = new B(10);
	}
}
