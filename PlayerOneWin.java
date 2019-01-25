import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * PlayerOneWin shows a win animation screen when player 1 wins
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
 */
public class PlayerOneWin extends World
{
    /**
     * Constructor for objects of class PlayerOneWin.
     * 
     */
    public PlayerOneWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
    }
    
    /**
     * Act - do whatever PlayerOneWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        initializeWinScreenOne();
    }
    
    /**
     * initializeWinScreenOne sets up the win screen for 
     * player one by pasting two images "Player 1" and "Wins"
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializeWinScreenOne()
    {
        GreenfootImage winScreenOne = new GreenfootImage("PlayerOne.png");
        winScreenOne.scale(400, 600);
        getBackground().drawImage(winScreenOne, 0, 0);
        Greenfoot.delay(35);
        GreenfootImage winOne = new GreenfootImage("Wins.png");
        winOne.scale(400, 600);
        getBackground().drawImage(winOne, 0, 0);
        Greenfoot.delay(35);
    }
}
