/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */


import java.util.ArrayList;
import java.util.Iterator;
public class OfferingList {
	ArrayList<String> Offer = new ArrayList<>();
	private Trading trading;

	private Offering[] offering;

	private OfferingIterator offeringIterator;

	OfferingList()
	{
		Offer.add("");
		Offer.add("");
		Offer.add("");
	}
	@SuppressWarnings("rawtypes")
	public Iterator createIterator()
	{
		return this.Offer.iterator();
	}
}
