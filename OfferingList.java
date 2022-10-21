/**
 * SER-515 OfferingList to store list of Offerings
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
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




