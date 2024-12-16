public class BottleSong {
	public static void main(String[] args) {
		
		int bottleQuantity = 10;
		String bottles = "bottles";
		
		while (bottleQuantity > 0) {
			
			/**
			 * Error:
			 * if (bottleQuantity == 1) {
			 * 	bottles = "bottle";
			 * }
			 */
			
			System.out.println(bottleQuantity + " green " + bottles + ", hanging on the wall.");
			System.out.println(bottleQuantity + " green " + bottles + ", hanging on the wall.");
			System.out.println("And if one green bottle should accidentally fall,");
			
			bottleQuantity = bottleQuantity - 1;

			if (bottleQuantity == 1) {
				bottles = "bottle";
			}
			
			if (bottleQuantity > 0) {
				System.out.println("There'll be " + bottleQuantity + 
									" green " + bottles + ", hanging on the wall.");
			} else {
				System.out.println("There'll be no green " + bottles + ", hanging on the wall.");
			}
		}
	}
}