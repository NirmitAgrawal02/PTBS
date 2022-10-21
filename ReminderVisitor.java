

/**
 * Abstract ReminderVisitor Class for Visitor Pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */
public class ReminderVisitor extends NodeVisitor {

	@Override
	public Reminder visitProduct(ProductList product) {

		System.out.println("Seller is selling Beef");
		System.out.println("Seller is selling Tomato");
		System.out.println("Seller is selling Onion");
		return product;
	}
	@Override
	public Reminder visitTrading(Trading trading) {
		System.out.println("Visiting Trading");
		return trading;
	}
	@Override
	public void visitFacade(Facade facade) {

		System.out.println("Visiting Facade");
	}

}
