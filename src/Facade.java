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


	String username;
	String theSelectedProduct;

	public void startFacade()
	{
		int UserType;
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
		System.out.println("Implementing Visitor Pattern....");
		remind();
		System.out.println("Implementing Iterator pattern ....");
		ProductList product = new ProductList(username, theSelectedProduct);
		@SuppressWarnings("rawtypes")
		Iterator iterate = product.createIterator();
		ProductIterator productIterator = new ProductIterator();
		OfferingList offList = new OfferingList();
		@SuppressWarnings("rawtypes")
		Iterator iterate1 = offList.createIterator();
		OfferingIterator OffIterate = new OfferingIterator();
		while(productIterator.HasNext(iterate))
		{
			System.out.println(productIterator.Next(iterate));
			System.out.println(OffIterate.Next(iterate1));
		}
		sc.close();
	}
	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList pl = new ProductList(username, theSelectedProduct);
		pl.accept(remind);
	}

}
