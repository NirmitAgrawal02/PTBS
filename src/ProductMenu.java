public interface ProductMenu {



	public abstract void showMenu();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

	public abstract void selectProduct(int UserType);

	public default void createProductList()
	{
		System.out.println("Product List Created");

	}

	public default void AttachProductToUser() {
		System.out.println("User Attached");
	}
	public default void productOperation()
	{
		System.out.println("Operation performed on the course");
	}

}
