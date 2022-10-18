public abstract class Person {
    public static ProductMenu pm;
    public abstract void showMenu();
    public abstract ProductMenu createProductMenu();
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
    public void showCombox()
    {
        pm.showComboxes();
    }
    public void showLabels()
    {
        pm.showLabels();
    }

}
