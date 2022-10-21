/**
 * SER-515 Bridge Pattern implemented for user and product object
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-20-2022
 */
public class BridgePattern {
    public Person bridge(int userType, String category)
    {
        System.out.println("Bridge Pattern Initiated");
        return personFactory.createObject(userType, category);
//
    }
}
