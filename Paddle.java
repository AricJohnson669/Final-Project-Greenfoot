import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    private String rightKey;
    private String leftKey;
    
    public Paddle()
    {
        getImage().scale(105, 100);
        rightKey = "right"; 
        leftKey = "left";
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
    } 
    
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown(rightKey))
        {
            setLocation(getX() + 3, getY());
        }
        
        if (Greenfoot.isKeyDown(leftKey))
        {
            setLocation(getX() - 3, getY());
        }
    }
}
