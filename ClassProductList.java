public class ClassProductList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ClassProductList.ProductIterator productIterator;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {

	}

	public class ProductIterator {

		private ClassProductList classProductList;

		public boolean hasNext() {
			return false;
		}

		public Product Next() {
			return null;
		}

		public void MoveToHead() {

		}

	}

}
