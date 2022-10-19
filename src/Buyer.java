/**
 * Buyer Class to inherit person class
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

public class Buyer extends Person {

	Buyer() {
		super(pm);
	}

	Buyer(ProductMenu pm) {
		super(pm);
	}

	@Override
	public void showMenu() {

	}

	@Override
	public ProductMenu createProductMenu() {
		return null;
	}

}
