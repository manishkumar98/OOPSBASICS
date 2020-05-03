class A {
	A() {
		System.out.println("Parent class A constructor");
	}
}
class B extends A {
	B() {
		System.out.println("Child class B constructor");
	}
}
class Test {
	public static void main (String args[])	{
		B obj = new B();
	}
}
