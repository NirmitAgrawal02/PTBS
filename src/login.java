/**
 * SER-515 Login class implementing the implementation for login using facade
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */
import java.io.File;
import java.util.Scanner;

public class login
{
    int userType;
    String name = "";

    login()
    {
        userType = 0;
    }
    public int Login() {
        System.out.println("Enter Username");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        try {
            userType = validation(password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if(userType == -1)
        {
            System.out.println("Incorrect username or password");
            System.exit(-1);
        }
        return userType;
    }
    public String userName()
    {
        return name;
    }
    public int validation(String password) throws Exception
    {
        int val,val2;
        String user , pass;
        File buy = new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\BuyerInfo.txt");
        Scanner buyer = new Scanner(buy);
        File sell = new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\SellerInfo.txt");
        Scanner seller = new Scanner(sell);
        while(buyer.hasNextLine())
        {
            String line = buyer.nextLine();
            int index = line.indexOf(":");
            user = line.substring(0,index);
            pass = line.substring(index+1);
            if(name.equals(user) && password.equals(pass))
            {
                return 0;
            }
        }
        while(seller.hasNextLine()) {
            String line = seller.nextLine();
            int index = line.indexOf(":");
            user = line.substring(0, index);
            pass = line.substring(index + 1);
            if(name.equals(user) && password.equals(pass)) {
                return 1;
            }
        }
        return -1;
    }
}
