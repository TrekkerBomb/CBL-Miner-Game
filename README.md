This is the CBL project for 2IP90 - Programming.
This project is called CBL-Miner-Game.

To run this game:
1. Unzip the file.
2. Load the project in an enviroment which can run and execute Java code.
3. Select "testminergame" as the main/primary package/folder.
4. Run "Main.java".

A new window should pop up.

Quick Instructions on how to play:
1. Movement:
    You can move around a Player using the 'W', 'A', 'S', or 'D' keys.
    These keys will move your character left, up, right, and down respectively.

2. Mining:
    Using your mouseclicks, you can mine the blocks around you.
    Hover in the direction you want to mine in.
    As long as you remain within the window, you will attempt to mine the block near to the Player when you click.

3. Menu navigation:
    If you double-click the "Switch Menu" button, you can switch between the Mining section and the Market Section.
    Click on the buttons within the Market section to sell, check, or buy.



Functionalities:
This game has several functionalities to explore:

Player Character with input-based Movement:
The Player can move around, as told in the quick instructions.
An additional note on movement:
Gravity affects the Player, so the Player will automatically move downwards if it is not above solid ground.

Mining:
Each square on the screen represents a Block.
You can click these to deal damage to the Block.
After enough damage, you mine the Block and leave a block of Air.

The type of block is represented by different visuals.
Every type of block also has their own:
    - HP
    - Pay-out

By depleting the HP, aka mining the block, you will receive the Pay-out connected to the type.

Inventory:
Pay-out of a Block gets recorded in your Inventory.
The game will keep track on how many Blocks and  which type of Block you have destroyed.

In this Inventory, you also store your Money and your Tool.
You can check your stored Money by pressing the "Check your performance" button in the Market.

Market:
By pressing the "Switch Menu" while seeing the Player and the Blocks, you will enter the Market section of the game.

Here you have several buttons.
The Buttons including the names of Block-types are present to sell your collected Blocks per type.
If you don't have any to sell, it will inform you via a pop-up message.

Besides those Buttons, there are two:
- "Check your performance"
- "Upgrade your Tool!"

"Check your performance" allows you to see via a pop-up message how much Money you have collected.
It also shows how many times you tried to mine Air Blocks.

"Upgrade your Tool!"
After collecting €10 or more, you can upgrade the damage per click to mine faster.
All money will be used to improve your Tool.
Your damage will improve by 1 every €10 spend.

If you don't have enough for a single point of improvement, you will be notified and no Money will be subtracted.

Randomizer:
Every instance has a different initial Block layout.
If you close the game and start anew, your progress will be reset.