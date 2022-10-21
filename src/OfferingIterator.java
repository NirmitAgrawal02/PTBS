import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OfferingIterator extends ListIterator{
		ArrayList<String> prod = new ArrayList<>();
	int a = 0;
	int size;
		OfferingIterator()
		{
			try {
				Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\UserProduct.txt"));
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

			if(this.HasNext(iterator))
				return this.prod.get(a);
			else
				return null;

	}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}



