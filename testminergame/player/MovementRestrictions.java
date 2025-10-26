package testminergame.player;

import java.awt.Point;
import testminergame.MapGame;


/**
 * Class for movement restrictions so the player cant walk trough solid blocks.
 */
public class MovementRestrictions {

    static int gravitySpeed = 3;
    
    public static int rightRestriction(Player player, MapGame map) {

        int xToCheck = player.position.x + player.width / 2;
        int xPosBlock = xToCheck + player.movementSpeed;
        int mapWidth = MapGame.getBlockSize() * MapGame.getGridsizeX();
        if (xPosBlock >= mapWidth) {
            return (mapWidth - player.width / 2) - player.position.x;
        } else {

            if (xPosBlock > MapGame.getBlockSize() * MapGame.getGridsizeX()) {
                return MapGame.getBlockSize() * MapGame.getGridsizeX() - player.position.x;
            }
            int xGridPosBlock = (int) xPosBlock / MapGame.getBlockSize();

            boolean allowedToMove = true;

            int startY = player.position.y - 1; // ondergrens 
            int stopY = player.position.y - player.height + 1; // bovengrens

            for (int i = startY; i > stopY; i--) {
                int yPosBlock = i;
                int yGridPosBlock = (int) yPosBlock / MapGame.getBlockSize();

                if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                    allowedToMove = false;
                }
            }

            if (!allowedToMove) {
                return xGridPosBlock * MapGame.getBlockSize() - xToCheck;
            } else {
                return player.movementSpeed;
            }
        }
    }


    public static int leftRestriction(Player player, MapGame map) {

        int xToCheck = player.position.x - player.width / 2;
        int xPosBlock = xToCheck - player.movementSpeed;
        if (xPosBlock <= 0) {
            return player.position.x - player.width / 2;
        } else {

            int xGridPosBlock = (int) xPosBlock / MapGame.getBlockSize();

            boolean allowedToMove = true;

            int startY = player.position.y - 1; // ondergrens 
            int stopY = player.position.y - player.height + 1; // bovengrens

            for (int i = startY; i > stopY; i--) {
                int yPosBlock = i;
                int yGridPosBlock = (int) yPosBlock / MapGame.getBlockSize();

                if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                    allowedToMove = false;
                }
            }

            if (!allowedToMove) {
                return xGridPosBlock * MapGame.getBlockSize() - xToCheck + MapGame.getBlockSize();
            } else {
                return player.movementSpeed;
            }
        }
    }

    public static int upRestriction(Player player, MapGame map) {
        int yToCheck = player.position.y - player.height; // bovenkant van de speler
        int yPosBlock = yToCheck - player.jumpspeed;
        if (yPosBlock <= 0) {
            return player.position.y - player.height;
        } else {
            if (yPosBlock <= 0) {
                return player.position.y - player.height;
            } else {
                int yGridPosBlock = (int) yPosBlock / MapGame.getBlockSize();

                boolean allowedToMove = true;

                int startX = player.position.x - player.width / 2 + 1;  // linkergrens
                int stopX = player.position.x + player.width / 2 - 1;   // rechtergrens

                for (int i = startX; i < stopX; i++) {
                    int xPosBlock = i;
                    int xGridPosBlock = (int) xPosBlock / MapGame.getBlockSize();

                    if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                        allowedToMove = false;
                    }
                }

                if (!allowedToMove) {
                    return (yGridPosBlock + 1) * MapGame.getBlockSize() - yToCheck;
                } else {
                    return player.jumpspeed;
                }
            }
        }
    }  

    public static void gravity(Player player, MapGame map) {

        int yToCheck = player.position.y;
        int yPosBlock = yToCheck + gravitySpeed;
        int mapHeight = MapGame.getBlockSize() * MapGame.getGridsizeY();
        if (yPosBlock > mapHeight) {
            player.position.y = mapHeight;
        } else {
            int yGridPosBlock = (int) (yPosBlock / MapGame.getBlockSize());

            boolean allowedToMoveL = true;
            boolean allowedToMoveR = true;

            int startX = player.position.x - player.width / 2 + 1; // linkergrens
            int stopX = player.position.x + player.width / 2 - 1; // rechtergrens

            for (int i = startX; i < player.position.x; i++) {
                int xGridPosBlock = (int) (i / MapGame.getBlockSize());

                if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                    allowedToMoveL = false;
                }
            }

            for (int i = player.position.x; i < stopX; i++) {
                int xGridPosBlock = (int) (i / MapGame.getBlockSize());

                if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                    allowedToMoveR = false;
                }
            }

            if (!allowedToMoveL || !allowedToMoveR) {
                player.position.y =  yGridPosBlock * MapGame.getBlockSize();
            } else {
                player.position.y = player.position.y + gravitySpeed;
            }
        }
    }
} 
