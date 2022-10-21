/**
 * Factory Pattern implemented
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */
public class personFactory extends Person {

    personFactory(ProductMenu pm)
    {
        super(pm);
    }

    @Override
    public ProductMenu createProductMenu()
    {

        return null;
    }
    public void startOperation(String username, String category)
    {

    }
    public static Person createObject(int userType, String category){
        System.out.println("Factory Pattern Initiated");
        if(userType == 0 && category.equals("Meat"))
        {
            return (new Buyer(new MeatProductMenu()));
        } else if (userType == 0 && category.equals("Produce")) {
            return (new Buyer(new ProduceProductMenu()));
        } else if (userType == 1 && category.equals("Meat")) {
            return (new Seller(new MeatProductMenu()));
        }else
        {
            return (new Seller(new ProduceProductMenu()));

        }
    }
}
