/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OfferingList {
	ArrayList<String> offer = new ArrayList<>();

	OfferingList() {
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\userProduct.txt"));
			while (s.hasNext()) {
				this.offer.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.offer.iterator();

	}
}




