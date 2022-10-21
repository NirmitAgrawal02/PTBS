import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {

	public void Menu(String category) {
		ArrayList<String> prod = new ArrayList<>();

		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\ProductInfo.txt"));
			while (s.hasNext()) {
				prod.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		for (String line : prod) {
			int index = line.indexOf(":");
			String print = line.substring(index + 1);
			if (category.equals(line.substring(0, index)))
				System.out.println(print);
		}
	}

	public String input(String username, String category) {
		System.out.println("Enter the value that you want to bid for");
		ArrayList<String> prod = new ArrayList<>();
		ArrayList<String> available_prod = new ArrayList<>();
		ArrayList<String> updated = new ArrayList<>();
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\ProductInfo.txt"));
			while (s.hasNext()) {
				prod.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		for (String line : prod) {
			int index = line.indexOf(":");
			String print = line.substring(index + 1);
			if (category.equals(line.substring(0, index)))
				updated.add(print);
		}
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\UserProduct.txt"));
			while (s.hasNext()) {
				String line = s.nextLine();
				int index = line.indexOf(":");
				String name = line.substring(0, index);

				if (name.equals(username)) {
					String get_prod = line.substring(index + 1);
					for (String line1 : prod) {
						int index1 = line1.indexOf(":");
						String p = line1.substring(index1 + 1);
						line1 = line1.substring(0, index1);
						if (line1.equals(category) && get_prod.equals(p)) {
							available_prod.add(p);

						}
					}

				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (available_prod.contains(input))
		{
			System.out.println("Value already entered  - Terminating");
			System.exit(-1);
		}

		else if (updated.contains(input)) {
			return input;
		} else {
			System.out.println("wrong value entered  - Terminating");
			System.exit(-1);
		}
		return "false";
	}

	public void showcart(String username, String category) {
		ArrayList<String> prod = new ArrayList<>();


		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\ProductInfo.txt"));
			while (s.hasNext()) {
				prod.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Nirmit\\ASU\\SER 515\\Assignments\\Design Pattern - Individual\\UserProduct.txt"));
			while (s.hasNext()) {
				String line = s.nextLine();
				int index = line.indexOf(":");
				String name = line.substring(0, index);

				if (name.equals(username)) {
					String get_prod = line.substring(index + 1);
					for (String line1 : prod) {
						int index1 = line1.indexOf(":");
						String p = line1.substring(index1 + 1);
						line1 = line1.substring(0, index1);
						if (line1.equals(category) && get_prod.equals(p)) {
							System.out.println(get_prod);
						}
					}

				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}