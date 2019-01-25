import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * PlayerTwoWin shows a win animation when player 2 wins
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
 */
public class PlayerTwoWin extends World
{
    
    /**
     * Constructor for objects of class PlayerTwoWin.
     * 
     */
    public PlayerTwoWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
    }
    
    /**
     * Act - do whatever PlayerTwoWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        initializeWinScreenTwo();
    }
    
    /**
     * initializeWinScreenTwo sets up the win screen for 
     * player one by pasting two images "Player 2" and "Wins"
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializeWinScreenTwo()
    {
        GreenfootImage winScreenTwo = new GreenfootImage("PlayerTwo.png");
        winScreenTwo.scale(400, 600);
        getBackground().drawImage(winScreenTwo, 0, 0);
        Greenfoot.delay(35);
        GreenfootImage winOne = new GreenfootImage("Wins.png");
        winOne.scale(400, 600);
        getBackground().drawImage(winOne, 0, 0);
        Greenfoot.delay(35);
    }
}
