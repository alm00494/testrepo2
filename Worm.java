package worm;

public class Worm {
	
	private String name, species, colour;
	private int length, age, depth, weight;
	
	
	public Worm(String name, String species, String colour, int length, int age, int depth, int weight) {
		this.name = name;
		this.species = species;
		this.colour = colour;
		this.length = length;
		this.age = age;
		this.depth = depth; 
		this.weight = weight;
	}//end constructor
	
	public void burrow() {
		
		System.out.println(this.name + " burrows deeper and loses 1g");
		this.depth = this.depth+1;
		this.weight = (this.weight-1);
		
	}
	
	public void surface() {
		
		System.out.println(this.name + " surfaces and loses 1g");
		this.depth = (this.depth-1);
		this.weight = (this.weight-1);
		
	}
	
	public void consumeNutrients() {
		
		System.out.println(this.name + " consumes nutrients and gains 1g");
		this.weight = (this.weight+1);
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println(this.name + " changes name to " + name);
		this.name = name;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Worm name = " + name + ", species = " + species + ", colour = " + colour + ", length = " + length + " cm, age = "
				+ age + " days" + ", depth = " + depth + "cm, weight = " + weight + "grams";
	}
	
	
	
	

}
