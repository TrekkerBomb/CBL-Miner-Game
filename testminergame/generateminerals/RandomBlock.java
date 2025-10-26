package testminergame.generateminerals;

import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import testminergame.Block;
import testminergame.blocks.Air;
import testminergame.blocks.Copper;
import testminergame.blocks.Diamond;
import testminergame.blocks.Gold;
import testminergame.blocks.Iron;
import testminergame.blocks.Platinum;
import testminergame.blocks.Stone;

/**
 * Generates a random block and returns it.
 */
public class RandomBlock {
    //private final long seed = 12341234;
    Random randomGen = new Random(/*seed*/);
    private int blockId;
    private final ProbablityBlock probability = new ProbablityBlock();
    private char charBlock;
    Map<Character, Block> blockDictonary = new HashMap<>(); 
    

    private int randomizeInt() {
        int newId = randomGen.nextInt(100);
        return newId;
    }
        
    /**
     * Determines which block to give. This is a FACTORY PATERN.
     * @param position position of the block in the grid.
     * @return a Block object of the right subclass.
     */
    public Block giveBlock(Point position) {
        Point pos = position;
        this.blockId = randomizeInt();
        List<Character> prob = probability.giveProbability();
        this.charBlock = prob.get(this.blockId);

        blockDictonary.put('a', new Air(pos));
        blockDictonary.put('c', new Copper(pos));
        blockDictonary.put('d', new Diamond(pos));
        blockDictonary.put('g', new Gold(pos));
        blockDictonary.put('i', new Iron(pos));
        blockDictonary.put('p', new Platinum(pos));
        blockDictonary.put('s', new Stone(pos));

        return blockDictonary.get(this.charBlock);

        /*
        switch (this.charBlock) {
            case 'a': return new Air(pos);
            case 's': return new Stone(pos);
            case 'c': return new Copper(pos);
            case 'i': return new Iron(pos);
            case 'g': return new Gold(pos);
            case 'p': return new Platinum(pos);
            case 'd': return new Diamond(pos);
            default: return null;
        } */
    }
}
