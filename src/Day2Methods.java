import java.util.ArrayList;
public class Day2Methods {
	public static void partOne(ArrayList<String> directions) {
        int depth = 0;
        int horizontal = 0;

        for (int i = 0; i < directions.size(); i++) {
            String word = directions.get(i).substring(0,directions.get(i).indexOf(" "));
            String quant = directions.get(i).substring(directions.get(i).indexOf(" ")+1);
            int quantity = Integer.parseInt(quant);
            if(word.equals("down")){
            	depth+=quantity;
            }
            else if(word.equals("up")){
            	depth-=quantity;
            }
            else if(word.equals("forward")){
            	horizontal+=quantity;
            }
        }
        System.out.println("depth " + depth + " horizontal " + horizontal);
        System.out.println("total : " + depth*horizontal);
    }
	public static void partTwo(ArrayList<String> directions) {
        int depth = 0;
        int horizontal = 0;
        int aim = 0;

        for (int i = 0; i < directions.size(); i++) {
            String word = directions.get(i).substring(0,directions.get(i).indexOf(" "));
            String quant = directions.get(i).substring(directions.get(i).indexOf(" ")+1);
            int quantity = Integer.parseInt(quant);
            if(word.equals("down")){
            	aim+=quantity;
            }
            else if(word.equals("up")){
            	aim-=quantity;
            }
            else if(word.equals("forward")){
            	horizontal+=quantity;
            	depth+=(aim*quantity);
            }
        }
        System.out.println("depth " + depth + " horizontal " + horizontal);
        System.out.println("total : " + depth*horizontal);
    }
}
