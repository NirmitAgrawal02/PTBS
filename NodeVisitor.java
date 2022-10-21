/**
 * Node Visitor class for Visitor Pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */



public abstract class NodeVisitor {

	public abstract Reminder visitProduct(ProductList product);

	public abstract Reminder visitTrading(Trading trading);

	@SuppressWarnings("all")
	public abstract void visitFacade(Facade facade);

}
