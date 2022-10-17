public class Buyer extends Buyer.Person {

	public void showMenu() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

	public class Person {

		private ProductMenu theProductMenu;

		private ProductMenu productMenu;

		public abstract void showMenu();

		public void showAddButton() {

		}

		public void showViewButton() {

		}

		public void showRadioButton() {

		}

		public void showLabels() {

		}

		public abstract ProductMenu CreateProductMenu();

	}

}
