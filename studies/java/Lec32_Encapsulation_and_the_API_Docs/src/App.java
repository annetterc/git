
class Plant {
	public static final int ID = 7;  // this can't be changed from outside the class because it is static and final - so no getters and setters, but can be accessed since it is public
	
	private String name;
	
	public String getData() {
		String data = "some stuff " + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {  
		return 9;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		
		plant.setName("me");
		
		
		
		System.out.println(plant.getName());
		System.out.println(plant.getData());
	}

}
