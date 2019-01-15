import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    private boolean startGame = false;
    private Ball theBall;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        initializePlayingField();
        
    }
    
    /**
     * initializePlayingField creates the start 
     * screen and pastes text in the middle of 
     * the world telling the player how to start
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializePlayingField()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        addPlayersAndObjects();
        showText ("Press 'Space' To Start", getWidth()/2, 350);
    }
    
    private void addPlayersAndObjects()
    {
        addObject(new Paddle(), getWidth()/2, 450);
        addObject(new Ball(), getWidth()/2, getHeight()/2);
        addObject(new Menu(), 580, 20);
    }
     
    public void act()
    {
        if (startGame == false)
        {
            
        }
        checkKeyPress();
    }
    
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            startGame = true;
            showText ("", getWidth()/2, 350);
        }
    }
    
    public boolean getStarted()
    {
        return startGame;
    }
}
