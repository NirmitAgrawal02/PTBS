/**
 * Trading Class - implementing visitor pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

public class Trading extends Reminder{

	private Product product;

	private OfferingList offeringList;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Trading Reminder...");
		return visitor.visitTrading(this);
	}

}
