class A {
	int a = 1;
}
class B extends A {
	float a = 2;
	 void printnum() {
	 	System.out.println(a);
	 }
	 
	 void printnumA() {
	 	System.out.println(super.a);
	 }
	 public static void main(String args[])	 {
	 	B obj = new B();
	 	obj.printnum();
	 	obj.printnumA();
	 }
}
	
