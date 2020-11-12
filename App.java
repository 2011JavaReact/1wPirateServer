import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class App{
	public static void main(String[] args){
		readFile();
		//Ask for user input

		// hardcode the data
		// data for pirate 1
		Pirate pirate1 = new Pirate("Hook","Captain");
		//data for pirate 2
		Pirate pirate2 = new Pirate("Black Beard", "Quartermaster");
		ArrayList<Pirate> pirates = new ArrayList<>();
		pirates.add(pirate1);
		pirates.add(pirate2);

		//output all of the pirates
		showPirates(pirates);

		// Set Role of Pirate
		if(args[0].equals(pirate1.getName())){
			pirate1.setRole(args[1]);
		}else if(args[0].equals(pirate2.getName())){
			pirate2.setRole(args[1]);
		}else{
			System.out.println("Pirate not found Exception");
		}
		
		showPirates(pirates);

		//  how we can make this better:
		//  replace hardcoded data with file input
		//  methods
		//  listening for user input during runtime
		//  menu, or user-friendly-ness
		//  giving them suggestions <--- extra feature
		
	}
	
	private static void showPirates(ArrayList<Pirate> pirates) {
		for(Pirate pirate: pirates) {
			System.out.println(pirate);
		}
	}
	
	private static ArrayList<Pirate> readFile(){
//		try {
//			methodA();			
//		}catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("db.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	private static void methodA() throws RuntimeException{
//		throw new RuntimeException("Something went wrong");
//	}
}
