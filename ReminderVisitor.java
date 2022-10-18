

/**
 * Abstract ReminderVisitor Class for Visitor Pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ProductList productList;
	@Override
	public void visitProduct(Product product) {
		System.out.println("Visiting Product");
	}
	@Override
	public void visitTrading(Trading trading) {
		System.out.println("Visiting Trading");
	}
	@Override
	public void visitFacade(Facade facade) {
		System.out.println("Visiting Facade");
	}

}
