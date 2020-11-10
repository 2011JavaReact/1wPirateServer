public class Pirate{
	public static void main(String[] args){
		//Ask for user input

		// hardcode the data
		// data for pirate 1
		String name1 = "Hook";
		String role1 = "Captain";
		//data for pirate 2
		String name2 = "Black Beard";
		String role2 = "Quartermaster";

		// Functionality 1: output all of the pirates
		System.out.println(name1 + " " + role1 + "\n" + name2 + " " + role2);

		// Set Role of Pirate
		role1 = role2 = args[0];
		System.out.println(name1 + " " + role1 + "\n" + name2 + " " + role2);

		// Write a conditonal that will choose which functinoality based on args[0]
		

	}
}
