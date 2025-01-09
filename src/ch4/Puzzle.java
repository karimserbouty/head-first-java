/**
 * Output:
 * result 543345
 */
public class Puzzle {
	public static void main(String [] args) {
		
		PuzzleValue[] values = new PuzzleValue[6];

		int number = 1;
		int i = 0;	
		
		while (i < 6) {
			
			values[i] = new PuzzleValue();
			
			values[i].intValue = number;
			
			number = number * 10;
			
			i = i + 1;
		}
		
		int result = 0;
		i = 6;
		
		while (i > 0) {
			
			i = i - 1;
			
			result = result + values[i].doStuff(i);
		}
		
		System.out.println("result " + result);
	}
}
		
