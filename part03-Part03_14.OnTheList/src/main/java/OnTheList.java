
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String searchStr = scanner.nextLine();
        
        Boolean strExists = list.contains(searchStr);
        System.out.println(strExists ? searchStr + " was found!" : searchStr + " was not found!");
        
    }
}
