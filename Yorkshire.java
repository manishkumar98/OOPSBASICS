public class Yorkshire extends Dog {
	private static int breedWeight = 25;
	public Yorkshire(String name) {
		super(name);
	}
	public String getNameY() {
		return name;
	} 
	int avgBreedWeight() {
		return breedWeight;
		}
	public String speak() {
		return "woof";
	}
}
