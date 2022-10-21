/**
 * TradingMenu Class - implementing funcionality of trading class
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TradingMenu {

    public void addTrading(String username, String input)
    {
        String content ="\n"+username+":"+input;
        String path = "C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\UserProduct.txt";
        try {
            Files.write(Paths.get(Paths.get(path).toUri()), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Trading has been added");
        viewTrading(username);
    }
    public void viewTrading(String username)
    {
        System.out.println("viewTrading");
    }
}
