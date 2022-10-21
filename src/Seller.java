import java.util.Scanner;

public class Seller extends Person{
	Seller(ProductMenu pm)
	{
		super(pm);
	}
	public void showMenu() {
		this.pm.showMenu();
	}
	public void showcart(String username, String Category){

	}
	public void addItem(String username, String category){

	}
	public void removeItem(String username, String category)
	{

	}
	public void startOperation(String username, String Category)
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please select one of the following actions");
			System.out.println("1. Show Menu");
			System.out.println("2. Show cart");
			System.out.println("3. Add an item to sell");
			System.out.println("4. Remove an item ");
			System.out.println("Any other number to exit");
			int ans = sc.nextInt();
			switch (ans) {
				case 1:
					showMenu();
					break;
				case 2:
					showcart(username, Category);
					break;
				case 3:
					addItem(username, Category);
					break;
				case 4:
					removeItem(username, Category);
					break;
				default:
					System.out.println("Terminating");
					System.exit(-1);
			}
		}while(true);
	}
	@Override
	public ProductMenu createProductMenu()
	{

		return null;
	}
}