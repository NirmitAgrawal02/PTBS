import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * SER-515 Offering Class to render GUI
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.3
 * @since 10-17-2022
 */




public class Offering {

	@SuppressWarnings("all")
	public void markOffering(String username, String input)
	{
		System.out.println("Bidding is marked for further negotiations");
	}
	public void addContentToFile(String content) throws IOException {
		String path = "C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\UserProduct.txt";
		Files.write(Paths.get(Paths.get(path).toUri()), content.getBytes(), StandardOpenOption.APPEND);
	}
	@SuppressWarnings("all")
	public void viewOffering(String username, String input)
	{
		System.out.println("viewOffering");
	}
	@SuppressWarnings("all")
	public void addContent(String username, String input)
	{
		String content ="\n"+username+":"+input;
		System.out.println("Bidding has been submitted");
		try {
			addContentToFile(content);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
	public void submitOffering(String username, String input) {
		Scanner sc = new Scanner(System.in);
		int ans;
		System.out.println("Enter the following value");
		System.out.println("1.Price at the value set by seller");
		System.out.println("2.Price differ");
		ans = sc.nextInt();
		if (ans == 1)
			viewOffering(username, input);
		else if (ans == 2)
			markOffering(username, input);
		else {
			System.out.println("Wrong input entered");
			System.exit(-1);
		}
	}

}
