abstract class Bike {
	abstract void run();
	Bike()	{
		System.out.println("Bike's Constructor");
	}
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Hero extends Bike {
	void run()	{
		System.out.println("avg speed of 70 kmph");
	}
	void HeroF() {
		System.out.println("Hero is cheap");
	}
}
class KTM extends Bike {
	void run() {	
		System.out.println("Avg speed of 100 kmph");
	}
}
class TestBike {
	public static void main(String args[])	{
		Bike obj;
		obj = new Hero();
		obj.changeGear();
		obj.run();
		obj = new KTM();
		obj.run();		
	}
} 
