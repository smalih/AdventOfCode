
import java.io.File;
import java.util.*;

public class Code{

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            ArrayList<String> misplaced = new ArrayList();
            int total = 0;
            while (sc.hasNextLine()) {
                String line1 = sc.nextLine();
                String line2 = sc.nextLine();
                String line3 = sc.nextLine();
//                String line = "vJrwpWtwJgWrhcsFMMfFFhFp";
                ArrayList<String> firstLine = new ArrayList(Arrays.asList(line1.split("")));
                ArrayList<String> secondLine = new ArrayList(Arrays.asList(line2.split("")));
                ArrayList<String> thirdLine = new ArrayList(Arrays.asList(line3.split("")));
                firstLine.retainAll(secondLine);
                firstLine.retainAll(thirdLine);
                misplaced.add(firstLine.get(0));
            }
            for (String letter : misplaced) {
                total+= getPriority(letter);
            }
            System.out.println(total);
        } catch (java.io.FileNotFoundException x) {
            x.printStackTrace();
            System.out.println("ERROR");
        }


    }
    public static int getPriority(String letter) {
        int priority;
        int asciiVal = (int) (letter.charAt(0));
        if (asciiVal >= 97 && asciiVal <= 122) {
            priority = asciiVal - 96;
        }
        else {
            priority = asciiVal - 38;
        }
        if (priority <= 0) {
            priority += 52;
        }
        return priority;

    }
}