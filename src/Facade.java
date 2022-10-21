/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */


import java.util.Scanner;
public class Facade {

	private int UserType;
	String username;
	String theSelectedProduct;
	private ProductList theProductList;
	private Buyer thePerson;

	public void startFacade()
	{
		System.out.println("Facade Pattern Initiated");
		Scanner sc = new Scanner(System.in);
		login log = new login();
		UserType = log.Login();
		username = log.userName();
		System.out.println("Select from the available Product List \n 1.Meat Product Menu \n 2.Produce Product Menu");
		theSelectedProduct = sc.nextLine();
		// Pattern Implemented - Bridge and Factory Method
		if((theSelectedProduct.equalsIgnoreCase("Meat")) ||(theSelectedProduct.equalsIgnoreCase("Produce") )) {
			BridgePattern bp = new BridgePattern();
			Person person = bp.bridge(UserType,theSelectedProduct);
			person.startOperation(username,theSelectedProduct);
		}
		else{
			System.out.println("Wrong Selection");
			System.exit(-1);
		}


//		System.out.println("Implementing Visitor Pattern....");
//		remind();
//		System.out.println("Implementing Iterator pattern ....");
//		ProductList products = new ProductList(username, theSelectedProduct);
//		@SuppressWarnings("rawtypes")
//		Iterator iterate = (Iterator) products.createIterator();
//		ProductIterator productIterator = new ProductIterator();
//		OfferingList offList = new OfferingList();
//		@SuppressWarnings("rawtypes")
//		Iterator iterate1 = (Iterator) offList.createIterator();
//		OfferingIterator OffIterate = new OfferingIterator();
//		while(productIterator.hasNext(iterate))
//		{
//			System.out.println(productIterator.Next(iterate));
//			System.out.println(OffIterate.Next(iterate1));
//		}
//		sc.close();
	}
	public void addTrading(TradingMenu TM) {

		TM.addTrading();
	}
	public void viewTrading(TradingMenu TM) {
		TM.viewTrading();
	}

	public void markOffering(Offering O) {
		String input = "Mutton";
		O.markOffering(username,input);
	}

	public void viewOffering(Offering O) {
		String input = "Mutton";
		O.viewOffering(username,input);
	}

	public void submitOffering(Offering O) {
		String input = "Mutton";
		O.submitOffering(username, input);
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList pl = new ProductList(username, theSelectedProduct);
		pl.accept(remind);
	}

	public void createUser(userinfoitem userInfoItem) {
		userInfoItem.createUser();
	}

	public void createProductList(ProductMenu pm) {
		pm.createProductList();
	}

	public void AttachProductToUser(ProductMenu pm) {
		pm.AttachProductToUser();
	}

	public void SelectProduct(ProductMenu pm, int UserType, String username, String productType) {
		pm.selectProduct(UserType, username,productType);
	}

	public void productOperation(ProductMenu pm) {
		pm.productOperation();
	}

}
