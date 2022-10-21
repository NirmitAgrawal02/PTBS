/**
 * SER-515 abstract Course Menu class
 *

 */
public interface ProductMenu {



	@SuppressWarnings("all")
	public abstract void showMenu();
	@SuppressWarnings("all")
	public abstract void showcart(String username);

	@SuppressWarnings("all")
	public abstract String input(String username);

	@SuppressWarnings("all")
	public abstract void showAddButton();

	@SuppressWarnings("all")
	public abstract void showViewButton();

	@SuppressWarnings("all")
	public abstract void showRadioButton();

	@SuppressWarnings("all")
	public abstract void showLabels();

	@SuppressWarnings("all")
	public abstract void selectProduct(int UserType, String username, String category);

	@SuppressWarnings("all")
	public default void createProductList()
	{
		System.out.println("Product List Created");

	}

	@SuppressWarnings("all")
	public default void AttachProductToUser() {
		System.out.println("User Attached");
	}
	@SuppressWarnings("all")
	public default void productOperation()
	{
		System.out.println("Operation performed on the produce");
	}

}
