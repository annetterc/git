
public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		// polymorphism means you can access any Child class of a parent where you usually would normally use the Parent class
		Plant plant2 = plant1; // would mean that it points to the same object "New Plant()" as plant1 does
		
		// Since Tree is a child class of Plant, I can also use the below
		Plant plant3 = tree;
		
		plant2.grow();
		plant3.grow(); // since plant3 is pointed to the var tree, which in turn points to the Tree Object class, it will use the Overidden method in class Treex
		
		doGrow(tree); // uses the below method but calls Tree class, which works since Tree extends from plant/ outputs "Tree growing"
	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
