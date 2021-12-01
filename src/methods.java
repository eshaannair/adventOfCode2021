import java.util.ArrayList;


public class methods {
	public static void partOne(ArrayList<Integer> numbers) {
        int measurements = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) < numbers.get(i)) {
                measurements++;
            }
        }
        System.out.println(measurements);
    }
	public static void partTwo(ArrayList<Integer> numbers) {
        int increases = 0;

        for (int i = 0; i < numbers.size() - 3; i++) {
        	/*
            if(numbers.get(i + 3)>numbers.get(i)){
            	increases += 1;
            }
            
            else{
            	increases += 0;
            }*/
            
            increases += (numbers.get(i + 3)>numbers.get(i))?1:0;
        }
        System.out.println("Answer for part two: " + increases);
        System.out.println(increases);
    }
}
