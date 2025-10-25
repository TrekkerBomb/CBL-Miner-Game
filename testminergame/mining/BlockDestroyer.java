package testminergame.mining;

import java.awt.Point;
import java.lang.Math;
import testminergame.MapGame;
import testminergame.blocks.Air;
import testminergame.player.Player;


/**
 * .
 */
public class BlockDestroyer {

    // this tooldamage is temporary
    int toolDamage = 3;
    
    /**
     * This function deals damage to the block.
     * @param map The map: used to get the block.
     * @param mouseInputH used to get the point to destroy the block.
     */
    public void damageBlock(MapGame map, Player currentPlayer, MouseInputHandler mouseInputH) {


        //code to get mouse position.
        int blockSize = MapGame.getBlockSize();
        Point mousePoint = mouseInputH.getMousePoint();

        //code to select block around the player.
        Point damageCenter = currentPlayer.getDamageCenter();
        double deltaX = mousePoint.x - damageCenter.x;
        double deltaY = mousePoint.y - damageCenter.y;

        //Calculation of the block that has to be destroyed.
        int xPosDamageBlock;
        int yPosDamageBlock;
        int reach = currentPlayer.getReach();

        double angle = Math.atan2(deltaY, deltaX);
        xPosDamageBlock = damageCenter.x + (int) (Math.cos(angle) * reach);
        yPosDamageBlock = damageCenter.y + (int) (Math.sin(angle) * reach);

        Point pointInGrid = new Point(xPosDamageBlock / blockSize, yPosDamageBlock / blockSize);
        //It needs to be a round number.
        Point pointInMap = new Point(pointInGrid.x * blockSize, pointInGrid.y * blockSize);
        //Restriction for i nmap
        boolean conditionX = pointInGrid.x >= 0 && pointInGrid.x <= (MapGame.getGridsizeX() - 1);
        boolean conditionY = pointInGrid.y >= 0 && pointInGrid.y <= (MapGame.getGridsizeY() - 1);

        if (conditionX && conditionY) {

            if (mouseInputH.allowDestroy && mouseInputH.getMousePoint() != null) {

                //code to damage the selected block and destroy when health <= 0.
                map.getBlockMap()[pointInGrid.x][pointInGrid.y].decreaseHealth(toolDamage);
                System.out.println(map.getBlockMap()[pointInGrid.x][pointInGrid.y].health);

                if (map.getBlockMap()[pointInGrid.x][pointInGrid.y].health <= 0) {
                    map.setBlockMap(new Air(new Point(pointInMap.x, pointInMap.y)));
                }
                mouseInputH.allowDestroy = false;
            }
        }


    }
}