import java.util.ArrayList;
import java.util.Iterator;
/**
 * SER-515 Product List Class to implement the iterator pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
@SuppressWarnings("rawtypes")
public class ProductList extends Reminder{
	ArrayList<String> prod = new ArrayList<>();


	public Iterator ProductIterator() {

		return this.prod.iterator();
	}

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Product List Reminder ...");
		return visitor.visitProduct(this);

	}



	}
