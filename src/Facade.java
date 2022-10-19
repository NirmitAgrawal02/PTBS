/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */


import java.util.Iterator;
import java.util.Scanner;
public class Facade {

	private int UserType;
	String theSelectedProduct;
	private ProductList theProductList;
	private Buyer thePerson;

	public void startFacade()
	{
		System.out.println("Facade Pattern Initiated");
		Scanner sc = new Scanner(System.in);
		UserType = login(new login());
		System.out.println("Select from the available Product List \n 1.Meat Product Menu \n 2. Produce Product Menu");
		theSelectedProduct = sc.nextLine();
		// Pattern Implemented - Bridge and Factory Method
		if(theSelectedProduct.equalsIgnoreCase("1.Meat Product Menu")) {
			SelectProduct(new MeatProductMenu(), UserType);
		}
		else if(theSelectedProduct.equalsIgnoreCase("2.Produce Product Menu")) {
			SelectProduct(new ProduceProductMenu(), UserType);
		}
		else{
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern....");
		remind();
		System.out.println("Implementing Iterator pattern ....");
		ProductList products = new ProductList();
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) products.createIterator();
		ProductIterator productIterator = new ProductIterator();
		OfferingList offList = new OfferingList();
		@SuppressWarnings("rawtypes")
		Iterator iterate1 = (Iterator) offList.createIterator();
		OfferingIterator OffIterate = new OfferingIterator();
		while(productIterator.hasNext(iterate))
		{
			System.out.println(productIterator.Next(iterate));
			System.out.println(OffIterate.Next(iterate1));
		}
		sc.close();
	}
	public int login(login object) {
		return object.Login();
	}
	public void addTrading(TradingMenu TM) {

		TM.initiateTrading();
	}
	public void viewTrading(TradingMenu TM) {
		TM.viewTrading();
	}

	public void markOffering(Offering O) {
		O.markOffering();
	}

	public void viewOffering(Offering O) {
		O.viewOffering();
	}

	public void submitOffering(Offering O) {
		O.submitOffering();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList pl = new ProductList();
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

	public void SelectProduct(ProductMenu pm, int UserType) {
		pm.selectProduct(UserType);
	}

	public void productOperation(ProductMenu pm) {
		pm.productOperation();
	}

}
