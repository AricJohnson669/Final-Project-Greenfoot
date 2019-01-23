import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTwoTurn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTwoTurn extends World
{
    World changeBackTo;
    
    /**
     * Constructor for objects of class PlayerTwoTurn.
     * 
     */
    public PlayerTwoTurn(World changeBack)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText ("Player Two's Turn", getWidth()/2, getHeight()/2);
        changeBackTo = changeBack;
    }
    
    public void act()
    {
        Greenfoot.delay(60);
        Greenfoot.setWorld(changeBackTo);
    }
}
