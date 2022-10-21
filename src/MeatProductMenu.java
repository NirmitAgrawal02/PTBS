/**
 * SER-515 Meat Product Menu responsible for bridge and factory patterns
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

public class MeatProductMenu implements ProductMenu {


	public void showMenu() {
		Product P = new Product();
		P.Menu("Meat");
	}
	public void showcart(String username)
	{
		Product p = new Product();
		p.showcart(username, "Meat");
	}
	public String input(String username)
	{
		Product p = new Product();
		return (p.input(username, "Meat"));
	}

	@Override
	public void showAddButton() {

		System.out.println("Add button Showed");
	}
	@Override
	public void showViewButton() {
		System.out.println("view button Showed");

	}
	@Override
	public void showRadioButton() {
		System.out.println("Radio button Showed");

	}
	@Override
	public void showLabels() {
		System.out.println("Labels Showed");

	}
	public void selectProduct(int UserType, String username, String category)
	{
		System.out.println("Meat Products Selected ....");
		BridgePattern b = new BridgePattern();
		Person person = b.bridge(UserType, category);
	}

}
