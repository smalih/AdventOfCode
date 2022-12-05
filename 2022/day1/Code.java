import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Code {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            int total = 0;
            int maxVal = 0;
            ArrayList<Integer> totals = new ArrayList();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line == "") {
//                    maxVal = Math.max(maxVal, total);
                    totals.add(total);
                    total = 0;
                } else {
                    total+=Integer.parseInt(line);
                }
            }
            Collections.sort(totals, Collections.reverseOrder());
            System.out.println(totals.get(0) + totals.get(1) + totals.get(2));
        }
        catch (java.io.FileNotFoundException x) {
            x.printStackTrace();
            System.out.println("ERROR");
        }
    }
}