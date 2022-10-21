import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * SER-515 Product List Class to implement the iterator pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
@SuppressWarnings("rawtypes")
public class ProductList extends Reminder{
	ArrayList<String> prod = new ArrayList<>();
	ArrayList<String> user = new ArrayList<>();
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
