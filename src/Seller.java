import java.util.Scanner;

public class Seller extends Person{
	Seller()
	{

	}
	Seller(ProductMenu pm)
	{
		super(pm);
	}
	public void showMenu() {
		this.pm.showMenu();
	}
	public void showcart(String username)
	{

		this.pm.showcart(username);
	}
	public void addTrading(String username){
		TradingMenu tm = new TradingMenu();
		String input = this.pm.input(username);
		tm.addTrading(username, input);
	}
	public void startOperation(String username, String Category)
	{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please select one of the following actions");
			System.out.println("1. Show Menu");
			System.out.println("2. Show cart");
			System.out.println("3. Add an item to sell");
			System.out.println("Any other number to exit");
			int ans = sc.nextInt();
			switch (ans) {
				case 1:
					showMenu();
					break;
				case 2:
					showcart(username);
					break;
				case 3:
					addTrading(username);
					break;
				default:
					System.out.println("Returning");
					break;
			}
			if(ans>3 || ans<1)
				break;
		}while(true);
	}
	@Override
	public ProductMenu createProductMenu()
	{

		return null;
	}
}