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
		if(args[0].equals("Hook")){
			role1 = args[1];
		}else if(args[0].equals("Black Beard")){
			role2 = args[1];
		}else{
			System.out.println("Pirate not found Exception");
		}
		
		System.out.println(name1 + " " + role1 + "\n" + name2 + " " + role2);

		// Write a conditonal that will choose which functinoality based on args[0]
		//  how we can make this better:
		//  objects and methods
		//  listening for user input during runtime
		//  menu, or user-friendly-ness
		//  giving them suggestions <--- extra feature
		

	}
}
