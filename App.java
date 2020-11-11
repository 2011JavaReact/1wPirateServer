public class App{
	public static void main(String[] args){
		//Ask for user input

		// hardcode the data
		// data for pirate 1
		Pirate pirate1 = new Pirate("Hook","Captain");
		//data for pirate 2
		Pirate pirate2 = new Pirate("Black Beard", "Quartermaster");

		// Functionality 1: output all of the pirates
		System.out.println(pirate1 + "\n" + pirate2);

		// Set Role of Pirate
		if(args[0].equals(pirate1.getName())){
			pirate1.setRole(args[1]);
		}else if(args[0].equals(pirate2.getName())){
			pirate2.setRole(args[1]);
		}else{
			System.out.println("Pirate not found Exception");
		}
		
		System.out.println(pirate1 + "\n" + pirate2);

		//  how we can make this better:
		//  replace hardcoded data with file input
		//  methods
		//  listening for user input during runtime
		//  menu, or user-friendly-ness
		//  giving them suggestions <--- extra feature
		
	}
}
