
public class Test3 {
	public static void main(String args[])	{
		Dog dog = new Dog("dog");
		System.out.println(dog.getName() + " says " + dog.speak());
		Labrador obj = new Labrador("Taffy","brown");
		Yorkshire obj2 = new Yorkshire("Juju");
		System.out.println(obj.getName() + " says " + obj.speak());
		System.out.println(obj2.getName() + " says " + obj2.speak());
		System.out.println("Weight of the Taffy is: " + obj.avgBreedWeight());
	}
}
