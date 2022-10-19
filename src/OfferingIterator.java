import java.util.Iterator;
public class OfferingIterator {

	private OfferingList offeringList;

	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}
	@SuppressWarnings("rawtypes")
	public String Next(Iterator iterator)
	{
		if(this.hasNext(iterator))
		{
			return (String) iterator.next();
		}
		else
			return null;
	}

	public void MovetoHead(Iterator iterator) {
		System.out.println("Head Moved");
	}

	public void Remove(Iterator iterator) {
		if(this.hasNext(iterator))
		{
			iterator.next();
		}
	}

}
