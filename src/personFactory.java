public class personFactory extends Person {

    personFactory(ProductMenu pm)
    {
        super(pm);
    }

    @Override
    public void showMenu()
    {

    }
    @Override
    public ProductMenu createProductMenu()
    {

        return null;
    }
    public static Person createObject(String str){
        Person p;
        System.out.println("Factory Method Initiated");
        if(str.equalsIgnoreCase("Buyer"))
        {
            p = new Buyer();
        }
        else
        {
            p = new Seller();
        }
        return p;
    }
}
