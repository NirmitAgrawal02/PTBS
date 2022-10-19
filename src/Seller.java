public class Seller extends Person{
	Seller()
	{
		super(pm);
	}
	Seller(ProductMenu pm)
	{
		super(pm);
	}
	@Override
	public void showMenu() {
		System.out.println("Selling Items");
	}

	public ProductMenu createProductMenu()
	{
		String test = "Meat Product Menu";
		if(test.equalsIgnoreCase("Meat Product Menu"))
			return new MeatProductMenu();
		else
			return new ProduceProductMenu();
	}
}