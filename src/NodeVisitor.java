/**
 * Node Visitor class for Visitor Pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */



public abstract class NodeVisitor {

	public abstract Reminder visitProduct(ProductList product);

	public abstract Reminder visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}