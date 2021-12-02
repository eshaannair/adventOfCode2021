
import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import java.util.ArrayList;
	class Main {
		public static void main(String[] args) {
	        try {
	            File input = new File("C:\\Users\\naire\\Documents\\Queries\\advent.txt");
	            Scanner scan = new Scanner(input);
	            ArrayList<String> directions = new ArrayList<String>();
	            while (scan.hasNextLine()) {
	                directions.add(scan.nextLine());
	            }
	            scan.close();
	            Day2Methods.partOne(directions);
	            Day2Methods.partTwo(directions);
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("not found!");
	            e.printStackTrace();
	        }
	    }
	}