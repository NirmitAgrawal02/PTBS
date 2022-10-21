/**
 * SER-515 Product Iterator to implement iterator pattern
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

public class ProductIterator extends ListIterator {
	ArrayList<String> prod = new ArrayList<>();
	int a = 0;
	int size;
	ProductIterator()
	{
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\ProductInfo.txt"));
			while (s.hasNext()) {
				prod.add(s.next());
				this.size++;
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("rawtypes")
	public boolean HasNext(Iterator iterator) {
		this.a = this.a+1;
		return this.a < this.size;
	}

	@SuppressWarnings("rawtypes")
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved..");
	}

	@SuppressWarnings("rawtypes")
	public String Next(Iterator iterator) {

			return this.prod.get(a);

		}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
