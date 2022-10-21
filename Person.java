/**
 * SER-515
 * Person abstract class
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */
public abstract class Person {
    public  ProductMenu pm;
    @SuppressWarnings("all")
    public abstract ProductMenu createProductMenu();
    public abstract void startOperation(String username, String category);
    Person()
    {

    }
    @SuppressWarnings("all")
    Person(ProductMenu pm)
    {
        this.pm = pm;
    }
    @SuppressWarnings("all")
    public void ShowAddButtons()
    {
        pm.showAddButton();
    }
    @SuppressWarnings("all")
    public void showViewButtons()
    {
        pm.showViewButton();
    }
    @SuppressWarnings("all")
    public void showRadio()
    {
        pm.showRadioButton();
    }
    @SuppressWarnings("all")
    public void showLabels()
    {
        pm.showLabels();
    }

}
