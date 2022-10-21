import jdk.jfr.Category;

import java.util.Scanner;

/**
 * Buyer Class to inherit person class
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

public class Buyer extends Person {

	Buyer() {
		super();
	}

	Buyer(ProductMenu pm) {
		super(pm);
	}

	public void showMenu() {
			this.pm.showMenu();
	}
	public void showcart(String username)
	{
		this.pm.showcart(username);
	}
	public void submitOffering(String username){
		Offering off = new Offering();
		String input = this.pm.input(username);
		off.submitOffering(username, input);
	}

	public void removeBidding(String username)
	{

	}
	public void startOperation(String username, String Category) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please select one of the following actions");
			System.out.println("1. Show Menu");
			System.out.println("2. Show cart");
			System.out.println("3. Add Bidding");
			System.out.println("4. Remove Bidding");
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
					submitOffering(username);
					break;
				case 4:
					removeBidding(username);
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
