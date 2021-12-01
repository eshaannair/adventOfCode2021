
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import java.util.ArrayList;
	class Main {
		public static void main(String[] args) {
	        try {
	            File input = new File("C:\\Users\\naire\\Documents\\Queries\\advent.txt");
	            Scanner scan = new Scanner(input);
	            ArrayList<Integer> numbers = new ArrayList<Integer>();
	            while (scan.hasNextInt()) {
	                numbers.add(scan.nextInt());
	            }
	            scan.close();

	            methods.partTwo(numbers);
	        } catch (FileNotFoundException e) {
	            System.out.println("not found!");
	            e.printStackTrace();
	        }
	    }
	}
	
	

