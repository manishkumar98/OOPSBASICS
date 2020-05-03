public class Person{
	static int age;
	static String name;
	public static void main(String args[]){
		Person obj=new Person();
		obj.age=20;
		obj.name="Manish";
		System.out.println("Name="+obj.name);
		System.out.println("Age="+obj.age);
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
}