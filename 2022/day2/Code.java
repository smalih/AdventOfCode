import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Code {

    private static int getScore(String oppMove, String outcome) {
        int score = 0;
        ArrayList<String> oppMoves = new ArrayList<>();
        oppMoves.add("A");
        oppMoves.add("B");
        oppMoves.add("C");
        ArrayList<String> outcomes = new ArrayList<>();
        outcomes.add("Y");
        outcomes.add("Z");
        outcomes.add("X");

        int oppIndex = oppMoves.indexOf(oppMove);
        int winIndex = (oppIndex + 1) % 3;
        int loseIndex = (oppIndex + 2) % 3;
        int outcomeIndex = outcomes.indexOf(outcome);
        int moveIndex = (oppIndex + outcomeIndex) % 3;

        score+= moveIndex + 1;

        switch (outcome) {
            case "X":
                break;
            case "Y":
                score+=3;
                break;
            case "Z":
                score+=6;
            default:
                break;
        }
        return score;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            int score = 0;
            ArrayList<Integer> totals = new ArrayList();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String oppMove = line.substring(0,1);
                String outcome = line.substring(2);
                score+=getScore(oppMove, outcome);
            }
            System.out.println(score);
        } catch (java.io.FileNotFoundException x) {
            x.printStackTrace();
            System.out.println("ERROR");
        }
    }
}