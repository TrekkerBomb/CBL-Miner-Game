package testminergame.mining;

import java.awt.Point;
import testminergame.MapGame;
import testminergame.blocks.Air;
import testminergame.player.Inventory;
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
     * @param mInputH used to get the point to destroy the block.
     */
    public void damageBlock(MapGame map, Player cPlayer, MouseInputHandler mInputH, Inventory inv) {


        //code to get mouse position.
        int blockSize = MapGame.getBlockSize();
        Point mousePoint = mInputH.getMousePoint();

        //code to select block around the player.
        Point damageCenter = cPlayer.getDamageCenter();
        double deltaX = mousePoint.x - damageCenter.x;
        double deltaY = mousePoint.y - damageCenter.y;

        //Calculation of the block that has to be destroyed.
        int xPosDamageBlock;
        int yPosDamageBlock;
        int reach = cPlayer.getReach();

        double angle = Math.atan2(deltaY, deltaX);
        xPosDamageBlock = damageCenter.x + (int) (Math.cos(angle) * reach);
        yPosDamageBlock = damageCenter.y + (int) (Math.sin(angle) * reach);

        Point pointInGrid = new Point(xPosDamageBlock / blockSize, yPosDamageBlock / blockSize);
        Point pointInMap = new Point(pointInGrid.x * blockSize, pointInGrid.y * blockSize);

        if (mInputH.allowDestroy && mInputH.getMousePoint() != null) {

            //code to damage the selected block and destroy when health <= 0.
            map.getBlockMap()[pointInGrid.x][pointInGrid.y].decreaseHealth(toolDamage);
            System.out.println(map.getBlockMap()[pointInGrid.x][pointInGrid.y].health);

            if (map.getBlockMap()[pointInGrid.x][pointInGrid.y].health <= 0) {
                String bKey = map.getBlockMap()[pointInGrid.x][pointInGrid.y].blockKey;
                inv.put(bKey, (inv.getValue(bKey) + 1));
                map.setBlockMap(new Air(new Point(pointInMap.x, pointInMap.y)));
            }
            mInputH.allowDestroy = false;
        }
    }
}