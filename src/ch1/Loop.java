public class Loop {
	public static void main(String[] args) {
		
		int budget = 100;
		int itemPrice = 20;
		int itemQuantity = 0;

		while (budget > 0) {
			
			budget = budget - itemPrice;
			itemQuantity = itemQuantity + 1;
			
			if (itemQuantity == 1) {
				System.out.print(itemQuantity + " item in the cart, ");
			} else {
				System.out.print(itemQuantity + " items in the cart, ");
			}
			
			System.out.println(budget + "$ left.");
		}
	}
}