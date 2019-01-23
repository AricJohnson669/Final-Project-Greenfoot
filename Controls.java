import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        initializeControls();
    }
    
    public void act()
    {
        checkScreenSwitch();
    }
    
    private void initializeControls()
    {
        GreenfootImage playFieldEx = new GreenfootImage("Gridv2.PNG");
        getBackground().setColor(Color.BLACK); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        showText("Click on your desired grid box \n in order to make your move", 150, 100);
        showText("Go Back", 460, 590);
        getBackground().drawImage(playFieldEx, 100, 150);
    }
    
    private void checkScreenSwitch()
    {
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseClicked(this))
        {
            if (mouseLocation.getX() > 400 && mouseLocation.getX() < 500 && mouseLocation.getY() > 550 && mouseLocation.getY() < 600)
                {
                    Greenfoot.setWorld (new StartScreen());
                }
        }
    }
}
