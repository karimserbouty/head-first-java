public class PuzzleTestDrive {
	public static void main(String[] args) {
		
		Puzzle p1 = new Puzzle();
		Puzzle p2 = new Puzzle();
		
		int x = 0;
		
		while (x < 4) {
			
			p1.hello();
			p1.count = p1.count + 1;
		
			if (x > 0) {
				p2.count = p2.count + 1;
			}
			
			if (x > 1) {
				p2.count = p2.count + p1.count;
			}
			
			x = x + 1;
		}
		
		System.out.println(p2.count);
	}
}