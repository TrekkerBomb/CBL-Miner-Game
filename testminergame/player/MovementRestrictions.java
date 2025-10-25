package testminergame.player;

import java.awt.Point;

import testminergame.MapGame;


/**
 * Class for movement restrictions so the player cant walk trough solid blocks.
 */
public class MovementRestrictions {
    
    public static int rightRestriction(Player player, MapGame map) {

        int xToCheck = player.position.x + player.width / 2;
        int xPosBlock = xToCheck + player.movementSpeed;
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


    public static int leftRestriction(Player player, MapGame map) {

        int xToCheck = player.position.x - player.width / 2;
        int xPosBlock = xToCheck - player.movementSpeed;
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

        public static int upRestriction(Player player, MapGame map) {

        int yToCheck = player.position.y - player.height - player.movementSpeed;
        int yPosBlock = yToCheck - player.movementSpeed;
        int yGridPosBlock = (int) yPosBlock / MapGame.getBlockSize();

        boolean allowedToMove = true;

        int startX = player.position.x - player.width / 2 + 1; // linkergrens
        int stopX = player.position.y - player.height - 1; // rechtergrens

        for (int i = startX; i < stopX; i++) {
            int xPosBlock = i;
            int xGridPosBlock = (int) xPosBlock / MapGame.getBlockSize();

            if (map.getBlockMap()[xGridPosBlock][yGridPosBlock].rockSolid) {
                allowedToMove = false;
            }
        }

        if (!allowedToMove) {
            return yGridPosBlock * MapGame.getBlockSize() - yToCheck + MapGame.getBlockSize();
        } else {
            return player.movementSpeed;
        }
    }


         
} 
