import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayField here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends greenfoot.World
{

    /**
     * Constructor for objects of class PlayField.
     * 
     */
    public PlayField()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        initializePlayField();
        addObjectsToWorld();
    }
    
    private void initializePlayField()
    {
        getBackground().setColor(Color.WHITE); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (200, 0, 4, getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (400, 0, 4, getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (0, 200, 600, 4);
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (0, 400, 600, 4);
    }
    
    private void addObjectsToWorld()
    {
        //addObject (new Player1(), getWidth()/2, getHeight()/2);
        //addObject (new Player2(), 500, getHeight()/2);
    }
}
