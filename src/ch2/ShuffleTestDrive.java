public class ShuffleTestDrive { // snippet 8
	public static void main (String[] args) { // snippet 5
		
		Shuffle s = new Shuffle(); // snippet 2
		
		s.playSnare(); // snippet 1
		
		s.snare = false; // snippet 7

		if (s.snare == true) { // snippet 6
			s.playSnare();
		}

		s.playTopHat(); // snippet 9
	}
}