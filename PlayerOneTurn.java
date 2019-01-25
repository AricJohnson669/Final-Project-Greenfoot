import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * PlayerOneTurn sets up a world that tells the players who's turn it is
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
 */
public class PlayerOneTurn extends World
{
    //instance variable changeBackTo changes the world, playField, to the world PlayerOneTurn, and back again
    World changeBackTo;
    /**
     * Constructor for objects of class PlayerOneTurn.
     * 
     */
    public PlayerOneTurn(World changeBack)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText ("Player One's Turn", getWidth()/2, getHeight()/2);
        changeBackTo = changeBack;
    }
    
    /**
     * Act - do whatever PlayerOneTurn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Greenfoot.delay(60);
        Greenfoot.setWorld(changeBackTo);
    }
}
