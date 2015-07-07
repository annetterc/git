
public enum Animal {
	//CAT, DOG, MOUSE  <--if no constructor is used, with constructor that does have a param it needs a ';' -- // this are actually objects of the type Animal
	
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {  // this constructor can not be declared public -- i can supply a param, but then I will have to instantiate the params
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called: " + name;
	}
	
}
