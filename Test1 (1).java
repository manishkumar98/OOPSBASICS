public class Test1 {
	public static void main(String[] args) {
		Labrador1 lab = new Labrador1("taffy","brown");
		Yorkshire1 york = new Yorkshire1("juju");
		System.out.println(lab.getNameL()+" says " + lab.speak());
		System.out.println(york.getNameY()+" says " + york.speak());
	}
}
