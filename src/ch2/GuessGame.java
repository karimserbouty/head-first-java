class GuessGame {
	Player player1;
	Player player2;
	Player player3;
	
	void startGame() {
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		
		boolean result1 = false;
		boolean result2 = false;
		boolean result3 = false;
		
		/**
		 * Check casting conversion for more examples.
		 */
		int target = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while (true) {
			System.out.println("Number to guess is " + target);
			
			player1.guess();
			player2.guess();
			player3.guess();
			
			guess1 = player1.number;
			System.out.println("Player one guessed " + guess1);
			
			guess2 = player2.number;
			System.out.println("Player two guessed " + guess2);
			
			guess3 = player3.number;
			System.out.println("Player three guessed " + guess3);
			
			if (guess1 == target) {
				result1 = true;
			}
			if (guess2 == target) {
				result2 = true;
			}
			if (guess3 == target) {
				result3 = true;
			}
			
			if (result1 || result2 || result3) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + result1);
				System.out.println("Player two got it right? " + result2);
				System.out.println("Player three got it right? " + result3);
				System.out.println("Game is over.");
				break;
			} else {
				System.out.println("Players will have to try again.");
			}
		}
	}
}