package testminergame.generateminerals;

import java.util.Random;
import testminergame.MapGame;

public class RandomGrid{
    MapGame map = new MapGame();

    private final int x = map.getGridsizeX();
    private final int y = map.getGridsizeY();
    private final long seed = 12341234;
    int[][] referenceGrid = new int[x][y];

    Random randomGen = new Random(seed);

    RandomGrid(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                referenceGrid[i][j] = randomizeInt();
            }

        }
    }

    int randomizeInt() {
        int newId = randomGen.nextInt(16);
        return newId;
    }
}