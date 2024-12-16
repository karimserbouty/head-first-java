public class BeerSong {
	public static void main(String[] args) {
		
		int bottleQuantity = 99;
		String bottles = "bottles";

		while (bottleQuantity > 0) {
			System.out.println(bottleQuantity + " " + bottles + " of beer on the wall, " + 
								bottleQuantity + " " + bottles + " of beer.");
			System.out.print("Take one down and pass it around, ");
			
			bottleQuantity = bottleQuantity - 1;

			if (bottleQuantity == 1) {
				bottles = "bottle";
			}
			
			if (bottleQuantity > 0) {
				System.out.println(bottleQuantity + " " + bottles + " of beer on the wall.");
			} else {
				bottles = "bottles";
				System.out.println("no more " + bottles + " of beer on the wall.");
			}
		}

		if (bottleQuantity == 0) {
			bottleQuantity = 99;
			System.out.println("No more " + bottles + " of beer on the wall, no more " + 
								bottles + " of beer on the wall.");
			System.out.println("Go to the store and buy some more, " + 
								bottleQuantity + " " + bottles + " of beer on the wall.");
		}
	}
}