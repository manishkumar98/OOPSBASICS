import java.io.*;
class Person{
	int age;
	String name;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void print(Person obj){
		System.out.println("Name="+obj.name);
		System.out.println("Age="+obj.age);
	}
	public static void main(String args[]){
		Person obj=new Person("Manish",20);
		obj.print(obj);
	}
}