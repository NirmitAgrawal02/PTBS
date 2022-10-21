import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 Product List Class to implement the iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */
@SuppressWarnings("rawtypes")
public class ProductList extends Reminder{
	@SuppressWarnings("all")
	ArrayList<String> prod = new ArrayList<>();
	ArrayList<String> user = new ArrayList<>();
	@SuppressWarnings("all")
	ProductList(String username, String productType){

	}

	public Iterator createIterator() {

		return this.user.iterator();
	}

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Product List Reminder ...");
		return visitor.visitProduct(this);

	}



	}
