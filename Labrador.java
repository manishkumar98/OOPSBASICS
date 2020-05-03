public class Labrador extends Dog {
	private String colour;
	private static int breedWeight = 35;
	public Labrador(String name, String colour){
		super(name);
		this.colour = colour;
	}
	public String speak() {
		return "WOOF";
	}
	public String getNameL() {
		return name;
	}
	int avgBreedWeight() {
		return breedWeight;
	}
}
