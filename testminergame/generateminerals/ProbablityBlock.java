package testminergame.generateminerals;

import java.util.ArrayList;
import java.util.List;

/**
 * Produces a line of characters to be used in probability.
 */
public class ProbablityBlock {
    private final int airProb = 1;
    private final int stoneProb = 49;
    private final int copperProb = 18;
    private final int ironProb = 14;
    private final int goldProb = 9;
    private final int platProb = 6;
    private final int diamondProb = 3;
    private List<Character> probablityList;

    /**
     * Generates a list of Characters, they correspond with the likelihood of appearing.
     */
    public ProbablityBlock() {
        this.probablityList = new ArrayList<>();
        this.probablityList.addAll(enterProbability(airProb, 'a'));
        this.probablityList.addAll(enterProbability(stoneProb, 's'));
        this.probablityList.addAll(enterProbability(copperProb, 'c'));
        this.probablityList.addAll(enterProbability(ironProb, 'i'));
        this.probablityList.addAll(enterProbability(goldProb, 'g'));
        this.probablityList.addAll(enterProbability(platProb, 'p'));
        this.probablityList.addAll(enterProbability(diamondProb, 'd'));
    }
    
    public List<Character> giveProbability() {
        return this.probablityList;
    }
    

    private List<Character> enterProbability(int prob, char firstChar) {
        List<Character> lineOfProbablity = new ArrayList<>();
        for (int i = 0; i < prob; i++) {
            lineOfProbablity.add(firstChar);
        }
        return lineOfProbablity;
    }
}
