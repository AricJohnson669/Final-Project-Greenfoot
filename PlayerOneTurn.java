import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOneTurn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOneTurn extends World
{
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
    
    public void act()
    {
        Greenfoot.delay(60);
        Greenfoot.setWorld(changeBackTo);
    }
}
