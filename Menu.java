import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        checkKeyPress();
        getWorld().showText ("Press 'Space' To Start", getWorld().getWidth()/2, 350);
    } 
    
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            //startGame = true;
            getWorld().showText ("", getWorld().getWidth()/2, 350);
            
        }
    }
}
