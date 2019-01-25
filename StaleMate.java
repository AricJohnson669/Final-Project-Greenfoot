import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Stale mate sets up an image when the players tye
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
 */
public class StaleMate extends World
{

    /**
     * Constructor for objects of class StaleMate.
     * 
     */
    public StaleMate()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
    }
    
    /**
     * Act - do whatever StaleMate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          initializeStaleMate();
    }
    
    /**
     * initializeStaleMate sets up the stale mate for 
     * player one by pasting an image "Stale Mate"
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializeStaleMate()
    {
        GreenfootImage staleMate = new GreenfootImage("StaleMate.png");
        staleMate.scale(400, 600);
        getBackground().drawImage(staleMate, 0, 0); 
    }
}
