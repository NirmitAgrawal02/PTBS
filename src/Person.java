public abstract class Person {
    public  ProductMenu pm;
    public abstract ProductMenu createProductMenu();
    public abstract void startOperation(String username, String category);
    Person()
    {

    }
    @SuppressWarnings("static-access")
    Person(ProductMenu pm)
    {
        this.pm = pm;
    }
    public void ShowAddButtons()
    {
        pm.showAddButton();
    }
    public void showViewButtons()
    {
        pm.showViewButton();
    }
    public void showRadio()
    {
        pm.showRadioButton();
    }
    public void showLabels()
    {
        pm.showLabels();
    }

}
